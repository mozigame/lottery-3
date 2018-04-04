package com.github.chengbin.auth.lock;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author zhangcb
 * @created 2018-01-30 16:37.
 */
@Slf4j
public class RedisLock {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 默认过期时间(防止锁获取或锁释放异常崩溃，锁无法释放)
     */
    private static final int DEFAULT_EXPIRE_TIME = 24*3600;

    /**
     * 默认超时时间
     */
    private static final int DEFALUT_TIMEOUT_TIME = 20 * 1000;


    /**
     *
     * @param key 目标数据的唯一键，value为锁的期望超时时间
     * @return
     */
    public boolean lock(String key){
        log.info("redis获取锁开始,key={}",key);
        long nowTime = new Date().getTime();
        Long expireTime = nowTime + DEFALUT_TIMEOUT_TIME;
        //1.setNx尝试获取锁(setNx不存在的话设置返回1，已经存在重复设置的话返回0)
        boolean result = redisTemplate.opsForValue().setIfAbsent(key,expireTime.toString());
        if(result){
            //获取锁成功，设置锁的过期时间
            redisTemplate.expire(key,DEFAULT_EXPIRE_TIME, TimeUnit.SECONDS);
            return true;
        }else{      //没有获取到锁
            //2.获取锁的超时时间
            String oldExpireTimeStr = redisTemplate.opsForValue().get(key);
            if(StringUtils.isNotEmpty(oldExpireTimeStr)){
                long oldExpireTime = Long.parseLong(oldExpireTimeStr);
                //3.锁的过期时间小于当前时间，锁超时，重新获取锁
                if(oldExpireTime < nowTime){
                    //getAndSet:返回旧值，设置新值
                    String currentExpireTime = redisTemplate.opsForValue().getAndSet(key,expireTime.toString());
                    if(currentExpireTime.equals(oldExpireTimeStr)){
                        redisTemplate.expire(key,DEFAULT_EXPIRE_TIME, TimeUnit.SECONDS);
                        return true;
                    }
                }else{
                    //锁未过期，获取锁失败
                    return false;
                }
            }else {
                log.warn("redis锁已经释放掉了,key:[{}]", key);
                return false;
            }
        }
        return false;
    }

    public boolean unlock(String key){
        log.info("redis释放锁，key={}",key);
        redisTemplate.delete(key);
        return true;
    }
}

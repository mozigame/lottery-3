package com.github.chengbin.auth.reflect;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangcb
 * @created 2018-02-02 16:40.
 */
public class UserDao implements IUserDao {

    private static final Map<Long, User> users = new ConcurrentHashMap<>();

    @Override
    @TimeAdvice(listener = TimeAdviceListener.class)
    public void insert(User user) {
        Long id = IdWorker.INSTANCE.nextId();
        user.setId(id);
        users.put(id,user);
    }

    @Override
    public void delete(Long id) {
        User user = select(id);
        users.remove(user);
    }

    @Override
    public void update(User user) {
        users.put(user.getId(),user);
    }

    @Override
    public User select(Long id) {
        return users.get(id);
    }
}

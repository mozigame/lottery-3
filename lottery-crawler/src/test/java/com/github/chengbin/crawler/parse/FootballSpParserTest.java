package com.github.chengbin.crawler.parse;

import com.alibaba.fastjson.JSONObject;
import com.github.chengbin.crawler.util.HttpClientUtil;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.http.entity.StringEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * @author zhangcb
 * @created on 2018/1/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FootballSpParserTest {

    private static final String SP_URL = "http://i.sporttery.cn/odds_calculator/get_odds?i_format=json&poolcode[]=hhad&poolcode[]=had&poolcode[]=ttg&poolcode[]=hafu&poolcode[]=crs&_=1506649626205";

    @Autowired
    private OkHttpClient okHttpClient;

    @Autowired
    private RestTemplate restTemplate;
    @Test
    public void test1(){
//        String query = restTemplate.getForEntity("https://admin.daysluck.com/capital/queryMerchantCapital.do",
//                String.class).getBody();
        String query = HttpClientUtil.callHttpGet("https://admin.daysluck.com/capital/queryMerchantCapital.do",
                "UTF-8");
        System.out.println(query);
    }

    @Test
    public void test(){
        Response response = null;
        try {
            Request request = new Request.Builder().url(SP_URL).header("Host","i.sporttery.cn")
                    .header("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.221 Safari/537.36 SE 2.X MetaSr 1.0").build();
            response = okHttpClient.newCall(request).execute();
            String result = response.body().string();
            Assert.isNull(request);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(response.body()!=null){
                try {
                    response.body().close();//一定要关闭，不然会泄露资源
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
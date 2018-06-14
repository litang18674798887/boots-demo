package com.pagoda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootRedis2ApplicationTests {

    @Autowired
    JedisConnectionFactory factory;

    /**
     * 简单测试
     */
    @Test
    public void test01() {
        //得到一个连接
        RedisConnection conn = factory.getConnection();
        conn.set("hello".getBytes(),"world".getBytes());
        System.out.println(conn.get("hello".getBytes()));
    }

}

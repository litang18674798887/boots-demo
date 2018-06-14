package com.pagoda;

import com.pagoda.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisMessageQueueApplicationTests {


    public static Logger logger= LoggerFactory.getLogger(RedisMessageQueueApplicationTests.class);


    @Test
    public void contextLoads() {
    }

    @Autowired
    RedisDao redisDao;


    @Test
    public void testRedis(){
        redisDao.setKey("name","litang");
        redisDao.setKey("age","20");
        logger.info(redisDao.getValue("name"));
        logger.info(redisDao.getValue("age"));
    }

}

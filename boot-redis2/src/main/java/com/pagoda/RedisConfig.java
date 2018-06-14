package com.pagoda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

/**
 * @author : litang
 * @date : Create in 2018/6/8
 */
@Configuration
public class RedisConfig {

    @Bean
    public JedisConnectionFactory redisCF(){
        //如果什么参数都不设置，默认连接的本地的6379端口
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setPort(6379);
        factory.setHostName("localhost");
        return factory;
    }
}

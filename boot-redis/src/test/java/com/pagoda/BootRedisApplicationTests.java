package com.pagoda;

import com.pagoda.bean.SysUserEntity;
import junit.framework.Assert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootRedisApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test() {
        stringRedisTemplate.opsForValue().set("id", "1");
        Assert.assertEquals("1", stringRedisTemplate.opsForValue().get("id"));
    }

    /**
     * 测试存储对象，redis 需要对对象进行序列化，取出对象数据后比对，又要进行反序列化
     * 所以注册了 RedisTemplate ，专门处理这类情况
     */
    @Test
    public void test1() {
        SysUserEntity sysUserEntity = new SysUserEntity();
        sysUserEntity.setId(2L);
        sysUserEntity.setEmail("k@wuwii.com");
        ValueOperations<String, SysUserEntity> operations = redisTemplate.opsForValue();
        operations.set("user1", sysUserEntity);
        Assert.assertEquals(sysUserEntity, Matchers.equalTo(operations.get("user1")));
    }



}

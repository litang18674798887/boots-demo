package com.pagoda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryContext;
import org.springframework.retry.backoff.FixedBackOffPolicy;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

import static java.util.Collections.singletonMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RetryDemoApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Test
    public void retry (){
//
//        //构建重试模板实例
//        RetryTemplate retryTemplate = new RetryTemplate();
//
//        //设置重试策略，主要设置重试次数
//        SimpleRetryPolicy policy = new SimpleRetryPolicy(3, Collections.<Class<? extends Throwable>, Boolean> singletonMap(Exception.class, true));
//
//        // 设置重试回退操作策略，主要设置重试间隔时间
//        FixedBackOffPolicy fixedBackOffPolicy = new FixedBackOffPolicy();
//        fixedBackOffPolicy.setBackOffPeriod(100);
//        retryTemplate.setRetryPolicy(policy);
//        retryTemplate.setBackOffPolicy(fixedBackOffPolicy);
//        // 通过RetryCallback 重试回调实例包装正常逻辑逻辑，第一次执行和重试执行执行的都是这段逻辑
//        final RetryCallback<Object, Exception> retryCallback = new RetryCallback<Object, Exception>() {
//            //RetryContext 重试操作上下文约定，统一spring-try包装
//            public Object doWithRetry(RetryContext context) throws Exception {
//                System.out.println("do some thing");
//                Exception e = uploadToOdps(map);
//                System.out.println(context.getRetryCount());
//                throw e;//这个点特别注意，重试的根源通过Exception返回
//            }
//        };
    }

}

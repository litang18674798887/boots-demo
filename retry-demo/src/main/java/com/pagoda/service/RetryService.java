package com.pagoda.service;

import com.pagoda.cotroller.RetryController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * @author : litang
 * @date : Create in 2018/6/7
 */
@Service
public class RetryService {

    private static final Logger logger = LoggerFactory.getLogger(RetryController.class);


    @Retryable(value = {Exception.class}, maxAttempts = 3, backoff = @Backoff(delay = 5000L, multiplier = 2))
    public void call() throws Exception {
        logger.info("do something...");
        throw new Exception("RPC调用异常");
    }

    @Recover
    public void recover(Exception e) {
        logger.info(" ---------------------------  ");
        logger.info(e.getMessage());
    }


}

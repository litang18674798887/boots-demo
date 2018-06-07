package com.pagoda.cotroller;

import com.pagoda.service.RetryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : litang
 * @date : Create in 2018/6/7
 */
@RestController
public class RetryController {

    private static final Logger logger = LoggerFactory.getLogger(RetryController.class);

    @Autowired
    private RetryService remoteService;

    @Autowired
    RetryService retryService;

    @RequestMapping("/retry")
    public String login () throws Exception {
        remoteService.call();
        return String.valueOf("11");
    }
}

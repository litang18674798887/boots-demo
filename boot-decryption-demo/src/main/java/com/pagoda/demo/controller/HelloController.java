package com.pagoda.demo.controller;

import com.pagoda.demo.utils.SerializedField;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : litang
 * @date : Create in 2018/6/11
 */
@RestController
public class HelloController {


    @SerializedField(encode = false)
    @PostMapping("/jiami")
    public String test01(@RequestBody String s){
        return "hello";
    }

}

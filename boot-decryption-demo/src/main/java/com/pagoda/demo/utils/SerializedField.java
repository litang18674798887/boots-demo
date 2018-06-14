package com.pagoda.demo.utils;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

/**
 * @author : litang
 * @date : Create in 2018/6/11
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface SerializedField {
    /**
     * 是否加密
     * @return
     */
    boolean encode()  default true;
}

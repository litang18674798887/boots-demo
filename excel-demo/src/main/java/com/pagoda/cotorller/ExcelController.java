package com.pagoda.cotorller;

import com.pagoda.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : litang
 * @date : Create in 2018/6/2
 */
@RestController
public class ExcelController {

    @Autowired
    ExcelService excelService;

    @RequestMapping("/hello")
    public String excelData(){
        excelService.excelData();
        return null;
    }
}

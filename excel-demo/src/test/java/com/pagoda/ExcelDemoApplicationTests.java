package com.pagoda;

import com.pagoda.bean.OrderData;
import com.pagoda.excel.ReadExcel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExcelDemoApplicationTests {

    @Autowired
    ReadExcel readExcel;

    @Test
    public void contextLoads() {
    }



}

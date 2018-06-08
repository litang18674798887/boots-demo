package com.pagoda.cotorller;

import com.pagoda.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : litang
 * @date : Create in 2018/6/2
 */
@RestController
public class ExcelController {

    @Autowired
    ExcelService excelService;

    @RequestMapping("/hello")
    public String excelData() {
        excelService.excelData();
        return null;
    }


    @RequestMapping("/65535")
    public String bigData() {

        excelService.bigData();
        return null;

    }


    /**
     * 数据量大，分为多个sheet导出excel
     * @param request
     * @param response
     */
    @RequestMapping("/holidaydetail/excelexport")
    public void exportExcel(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> paramMap = new HashMap<>();
        try {

            List<String> formList = new ArrayList<>();
            for (int i = 0; i < 100000; i++) {
                formList.add("李唐" + i);
            }
            response.setContentType("application/vnd.ms-excel");
            //解决导出文件IE和其他浏览器中文名乱码问题
            String filename = null;
            long currentTime = System.currentTimeMillis();
            if (request.getHeader("User-Agent").indexOf("Mozilla") != -1) {
                filename = URLEncoder.encode("李唐" + currentTime + ".xls", "UTF-8");
            } else {
                filename = new String(("假期明细" + currentTime + ".xls").getBytes(), "ISO8859-1");
            }
            response.setHeader("Content-Disposition", "attachment;filename=" + filename);
            ServletOutputStream outputStream = response.getOutputStream();
            //将上面查到的集合传给service层处理
            excelService.exportExcel(formList, outputStream);
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

package com.pagoda.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author : litang
 * @date : Create in 2018/6/8
 */
public class ExlUtil2 {

//    /**
//     * @param excelHeader
//     *            表头信息
//     * @param list
//     *            要导出到excel的数据源,List类型
//     * @param sheetName
//     *            表名
//     * @return
//     */
//    public static ResponseEntity<byte[]> getDataStream(ExcelHeader excelHeader,
//                                                       List list, String sheetName) {
//        LinkedHashMap<String, List> map = new LinkedHashMap<String, List>();
//        List<String[]> headNames = new ArrayList<String[]>();
//        List<String[]> fieldNames = new ArrayList<String[]>();
//        String[] sheetNames = new String[100];
//        //处理Excel生成多个工作表
//        //定义为每个工作表数据为50000条
//        if (list.size() > 50000) {
//            int k = (list.size() + 50000) / 50000;
//            for (int i = 1; i <= k; i++) {
//                if (i < k) {
//                    map.put(sheetName + i,
//                            list.subList((i - 1) * 50000, i * 50000));
//                } else {
//                    map.put(sheetName + i,
//                            list.subList((i - 1) * 50000, list.size()));
//                }
//
//                headNames.add(excelHeader.getHeadNames().get(0));
//                fieldNames.add(excelHeader.getFieldNames().get(0));
//                sheetNames[i - 1] = sheetName;
//            }
//
//        } else {
//            map.put(sheetName, list);
//            headNames.add(excelHeader.getHeadNames().get(0));
//            fieldNames.add(excelHeader.getFieldNames().get(0));
//            sheetNames[0] = sheetName;
//        }
//
//        byte[] buffer = null;
//
//        try {
//            buffer = ExcelUtil2.output(headNames, fieldNames, sheetNames, map);
//
//        } catch (IllegalArgumentException | IllegalAccessException
//                | IOException e) {
//            e.printStackTrace();
//        }
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
//
//        /*
//         * try { sheetName=URLEncoder.encode(sheetName,"UTF8"); } catch
//         * (UnsupportedEncodingException e) { e.printStackTrace(); }
//         */
//        try {
//            sheetName = new String(sheetName.getBytes("gbk"), "iso-8859-1");
//        } catch (UnsupportedEncodingException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        String fileGenerateTime = DateFormatUtil.toStr(new Date());
//        headers.setContentDispositionFormData("attachment", sheetName
//                + fileGenerateTime + ".xlsx");
//        return new ResponseEntity<byte[]>(buffer, headers, HttpStatus.CREATED);
//    };
}

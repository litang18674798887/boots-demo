package com.pagoda.utils;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;

/**
 * @author : litang
 * @date : Create in 2018/6/8
 */
public class ExcelUtils {

    /**
     * 创建列标题栏样式
     * 水平垂直居中
     */
    public static HSSFCellStyle createCellStyle(HSSFWorkbook workbook, short fontSize) {
        HSSFCellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeightInPoints(fontSize);
        cellStyle.setFont(font);
        return cellStyle;
    }

    /**
     * 创建新工作表
     */
    public static HSSFSheet createWorkbook(HSSFWorkbook workbook, HSSFCellStyle cellStyle, int num) {
        HSSFSheet sheet = workbook.createSheet("明细" + num);
        sheet.setDefaultColumnWidth(18);
        String[] titles = {"id"};
        HSSFRow row = sheet.createRow(0);
        for (int i = 0; i < titles.length; i++) {
            HSSFCell cell = row.createCell(i);
            cell.setCellStyle(cellStyle);
            cell.setCellValue(titles[i]);
        }
        return sheet;
    }

}

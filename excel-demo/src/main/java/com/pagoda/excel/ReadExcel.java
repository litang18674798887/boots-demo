package com.pagoda.excel;

import com.pagoda.bean.OrderData;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : litang
 * @date : Create in 2018/6/1
 */
@Component
public class ReadExcel {

    public static void main(String[] args) {
        ReadExcel obj = new ReadExcel();
        // 此处为我创建Excel路径：E:/zhanhj/studysrc/jxl下
        File file = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\01.xls");
        List excelList = obj.readExcel(file);
        System.out.println("list中的数据打印出来");
        for (int i = 0; i < excelList.size(); i++) {
            OrderData orderData = new OrderData();
            List list = (List) excelList.get(i);
            System.out.println(list);
        }

    }
    // 去读Excel的方法readExcel，该方法的入口参数为一个File对象
    public List readExcel(File file) {
        try {
            // 创建输入流，读取Excel
            InputStream is = new FileInputStream(file.getAbsolutePath());
            // jxl提供的Workbook类
            Workbook wb = Workbook.getWorkbook(is);
            // Excel的页签数量
            int sheet_size = wb.getNumberOfSheets();
            for (int index = 0; index < sheet_size; index++) {
                List<List> outerList=new ArrayList<List>();
                // 每个页签创建一个Sheet对象
                Sheet sheet = wb.getSheet(index);
                // sheet.getRows()返回该页的总行数
                for (int i = 0; i < sheet.getRows(); i++) {
                    List innerList=new ArrayList();
                    // sheet.getColumns()返回该页的总列数
                    for (int j = 0; j < sheet.getColumns(); j++) {
                        String cellinfo = sheet.getCell(j, i).getContents();
                        if(cellinfo.isEmpty()){
                            continue;
                        }
                        innerList.add(cellinfo);
                        System.out.print(cellinfo);
                    }
                    outerList.add(i, innerList);
                    System.out.println();
                }
                return outerList;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String[][] getSheetData(XSSFSheet sheet) throws IOException {
        String[][] testArray = new String[sheet.getPhysicalNumberOfRows()][];
        for(int rowId =0;rowId<sheet.getPhysicalNumberOfRows();rowId++){
            XSSFRow row = sheet.getRow(rowId);
            List<String> testSetList = new ArrayList<String>();
            for(int column=0;column<row.getPhysicalNumberOfCells();column++){
                row.getCell(column).setCellType(Cell.CELL_TYPE_STRING);
                testSetList.add(row.getCell(column).getStringCellValue());
            }
            testArray[rowId] = (String[])testSetList.
                    toArray(new String[testSetList.size()]);
        }
        return testArray;
    }
}

package com.tmb.utils;

import com.tmb.constants.FrameworkConstants;
import com.tmb.exceptions.FrameworkException;
import com.tmb.exceptions.InvalidPathForExcelException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ExcelUtils {

    private ExcelUtils() {

    }

    public static List<Map<String, String>> getTestDetails(String sheetname) {
        List<Map<String, String>> list = null;

        try (FileInputStream fs = new FileInputStream(FrameworkConstants.getEXCELPATH())) {


            XSSFWorkbook workbook = new XSSFWorkbook(fs);
            XSSFSheet sheet = workbook.getSheet(sheetname);

            int lastRowNum = sheet.getLastRowNum();
            int lastColNum = sheet.getRow(0).getLastCellNum();

            Map<String, String> map = null;
            list = new ArrayList<>();

            for (int i = 1; i <= lastRowNum; i++) {
                map = new HashMap<>();
                for (int j = 0; j < lastColNum; j++) {
                    String key = sheet.getRow(0).getCell(j).getStringCellValue();
                    String value = sheet.getRow(i).getCell(j).getStringCellValue();
                    map.put(key, value);

                }
                list.add(map);
            }

        } catch (FileNotFoundException e) {
            throw new InvalidPathForExcelException("Excel file you are trying to read is not found");
        } catch (IOException e) {
            throw new FrameworkException("Some IO Exception happened while excel reading");
        }
        return list;
    }
}

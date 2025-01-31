package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelHelper {
    private FileInputStream fileInputStream;
    private Workbook workbook;

    public ExcelHelper() {
        try {
            this.fileInputStream = new FileInputStream(new PropertiesReader().getExcelPath());
            this.workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getTextFromCell(String sheetName, int rowNumber, int columnNumber) {
        Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(rowNumber - 1);
        if (row != null) {
            Cell cell = row.getCell(columnNumber - 1);
            if (cell != null) {
                return cell.getStringCellValue();
            }
        }
        return "";
    }

    public void closeWorkbook() {
        try {
            if (workbook != null) {
                workbook.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


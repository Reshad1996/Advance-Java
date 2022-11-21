package Class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo01 {
    public static void main(String[] args) throws IOException {

        // We need to know the path of the file
        String path = "Data/Test01.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        // that special class that can handle the xlsx files
        XSSFWorkbook excelFile = new XSSFWorkbook(fileInputStream);
        Sheet sheet = excelFile.getSheet("Sheet1");

        // getting row that contain data rows are index based so they will start from zero
        Row row0 = sheet.getRow(0);
        System.out.println(row0.getCell(0));

        // get the data from row1
        Row row1 = sheet.getRow(1);
        System.out.println(row1.getCell(0));




    }
}

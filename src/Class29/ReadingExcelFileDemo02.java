package Class29;

import Utils.ExcelReader;

import java.io.IOException;

public class ReadingExcelFileDemo02 {

    public static void main(String[] args) throws IOException {

        var excelData=   ExcelReader.read("Data/Test01.xlsx");
        System.out.println(excelData);

    }
}

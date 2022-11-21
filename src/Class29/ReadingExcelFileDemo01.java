package Class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

public class ReadingExcelFileDemo01 {
    public static void main(String[] args) throws IOException {

        // location of your file on your HardDrive where file is stored
        String path = "Data/Test01.xlsx";
        // Read the  data from HardDrive brings it to RAM in the row from 101010101010
        // In simple words we can say computer has navigated to that file
        FileInputStream fis = new FileInputStream(path);
        // This class converts the raw bytes to Excel format or in simple words it is that special  software

        XSSFWorkbook excel = new XSSFWorkbook(fis);

        Sheet sheet= excel.getSheet("Sheet1");
        int noOfRow=sheet.getPhysicalNumberOfRows();
        // getting the first row so that we can use it as keys for our map
        Row headerRow= sheet.getRow(0);
        // the Map that will store the data for each row

        // A loop that goes through all the rows that contain the data.
        for (int rowNo = 1; rowNo < noOfRow; rowNo++) {
            LinkedHashMap<String,String> rowMap=new LinkedHashMap<>();
            // get a dataRow from sheet one by one through loop
            Row dataRow=sheet.getRow(rowNo);
            // getting the count of how many cells contain the data
            int noOfCell=dataRow.getPhysicalNumberOfCells();
            // A loop to go through all the cells
            for (int cellNo = 0; cellNo < noOfCell; cellNo++) {

                //getting keys from header row and values from data row
                String key=headerRow.getCell(cellNo).toString();
                String value=dataRow.getCell(cellNo).toString();
                rowMap.put(key,value);
            }
            System.out.println(rowMap);


        }








    }
}

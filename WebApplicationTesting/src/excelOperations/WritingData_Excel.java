package excelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData_Excel 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Kavya\\Desktop\\KavyaTestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("sheet2");
		
		Row r = ws.createRow(1);
		Cell c = r.createCell(1);
		c.setCellValue("KavyaRamesh");
		
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\Kavya\\Desktop\\KavyaTestData.xlsx");
		wb.write(file1);
	}

}

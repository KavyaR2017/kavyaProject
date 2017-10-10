package excelOperations;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData_Excel 
{

	public static void main(String[] args) throws IOException  
	{
		FileInputStream File = new FileInputStream("C:\\Users\\Kavya\\Desktop\\KavyaTestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(File);
		XSSFSheet ws = wb.getSheet("sheet1");
		
		
		Row r = ws.getRow(1);
	/*	for(int i=0;i<6;i++)
		{
		Cell c = r.getCell(i);
		
		String Data = c.getStringCellValue();
		
		System.out.println(Data);
		} */
		
		Cell c = r.getCell(1);
		System.out.println(c.getStringCellValue());
		 
		

	}

}

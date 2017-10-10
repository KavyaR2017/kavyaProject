package excelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData_Excel1 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream File = new FileInputStream("C:\\Users\\Kavya\\Desktop\\KavyaTestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(File);
		XSSFSheet ws = wb.getSheet("sheet1");
		
		
		int RowCount = ws.getLastRowNum(); 
		for(int i=0;i<=RowCount;i++)
		{
		Row r = ws.getRow(i);
		
	    int ColCount = r.getLastCellNum();
	    for(int j=0;j<ColCount;j++)
	    {
	    	Cell c = r.getCell(j);
	    	System.out.print(c.getStringCellValue()+"   ");
	    }
	    System.out.println();
		}
		
		

	}

}

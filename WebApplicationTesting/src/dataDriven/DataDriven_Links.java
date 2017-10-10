package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDriven_Links 
{
	FirefoxDriver Driver;
	@BeforeTest
	public void SetUp()
	{
		Driver = new FirefoxDriver();
		Driver.get("http://newtours.demoaut.com");
		Driver.manage().window().maximize();
	}
	@Test
	public void LinksTesting() throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Kavya\\Desktop\\DataDriverLinksTestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		int RowCount = ws.getLastRowNum();
		for(int i=1;i<=RowCount;i++)
		{
			Row r = ws.getRow(i);
			Cell c = r.getCell(0);
			try
			{
			String LinkName = c.getStringCellValue();
			Driver.findElement(By.linkText(LinkName)).click();
			
			String ActualURL = Driver.getCurrentUrl();
			
			r.createCell(2).setCellValue(ActualURL);
			String ExpectedURL = r.getCell(1).getStringCellValue();
			
			if(ActualURL.contains(ExpectedURL))
				{
				r.createCell(3).setCellValue("URL matched - PASS");
				}
			else
				{
				r.createCell(3).setCellValue("URL not matched - FAIL");
				}
			}
			
			catch(Exception e)
			{
				r.createCell(3).setCellValue("Link Not Present");
			}
			Driver.navigate().back();
			FileOutputStream file1 = new FileOutputStream("C:\\Users\\Kavya\\Desktop\\DataDriverLinksTestData.xlsx");
			wb.write(file1);
		}
		
	}
	@AfterTest
	public void tearDown()
	{
		Driver.close();
	}

}

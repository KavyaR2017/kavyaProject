package dataDriven;

import java.io.FileInputStream;
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

public class DataDriveenLinksTesting 
{

	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void linksTesting() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Kavya\\Desktop\\KavyaDataDriverLinksTestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		int RowCount =ws.getLastRowNum();
		
		for(int i=1;i<=RowCount;i++)
		{
			Row r=ws.getRow(i);
			Cell c =r.getCell(0);
		try{	
			String linkName=c.getStringCellValue();
			
			driver.findElement(By.linkText(linkName)).click();
			
			String ActualUrl=driver.getCurrentUrl();
			
			r.createCell(2).setCellValue(ActualUrl);
			
			String ExpectedUrl=r.getCell(1).getStringCellValue();
			
			if(ActualUrl.contains(ExpectedUrl))
			{
				r.createCell(3).setCellValue("URL Matched - PASS");
			}
			else
			{
				r.createCell(3).setCellValue("URL not Matched -- FAIL");
			}
		}
		catch(Exception e)
		{
			r.createCell(3).setCellValue("link Not Existing - Error");
		}
			driver.navigate().back();
			
			
			FileOutputStream file1 = new FileOutputStream("C:\\Users\\Kavya\\Desktop\\KavyaDataDriverLinksTestData.xlsx");
			wb.write(file1);
				
			
		}
		
		System.out.println("LinksTesting SuccessFul");
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	
	
}

package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class Practice1 
{
	FirefoxDriver Driver;
	@BeforeTest
	public void BrowserLaunch()
	{
		Driver = new FirefoxDriver();
		Driver.get("http://athena.gaintheory.tools/forecasting/#/forecasting/3116");
		Driver.manage().window().maximize();
	}
	@Test
	public void TestApplication() throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Kavya\\Desktop\\KavyaUserTestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("sheet2");
		
		Row r = ws.getRow(0);
		
		Driver.findElement(By.id("username")).sendKeys(r.getCell(0).getStringCellValue());
		Driver.findElement(By.name("password")).sendKeys(r.getCell(1).getStringCellValue());
		Driver.findElement(By.id("btn_submit")).click();
		
		String ActualTitle = Driver.getTitle();
		String ExpectedTitle = "Dashboard";
		
		if(ActualTitle.contains(ExpectedTitle))
		{
			System.out.println("Test case Passed");
			
		}
		else
		{
			System.out.println("Test case Failed");
		}
	}
		
		/*Driver.findElement(By.id("username")).sendKeys("athenauser@gaintheory.com");
		Driver.findElement(By.name("password")).sendKeys("athena$123");
		Driver.findElement(By.id("btn_submit")).click();
		
		String ActualTitle = Driver.getTitle();
		String ExpectedTitle = "Athena";
		
		if(ActualTitle.contains(ExpectedTitle))
		{
			System.out.println("Test case Passed");
			
		}
		else
		{
			System.out.println("Test case Failed");
		}
		
		
	}*/
	@AfterTest
	public void TearDown()
	{
		Driver.close();
	}

}

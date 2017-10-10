package excelOperations;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Practice1 
{
	FirefoxDriver Driver;
	@BeforeTest
	public void SetUp()
	{
		Driver = new FirefoxDriver();
		Driver.get("http://www.newtours.demoaut.com");
		Driver.manage().window().maximize();
	}
	public void ExcelTesting()
	{
		
	}

}

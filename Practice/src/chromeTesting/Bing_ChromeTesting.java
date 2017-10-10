package chromeTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bing_ChromeTesting 
{
	
	ChromeDriver driver;
	@BeforeTest
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://www.bing.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void NewToursRegistration()
	{
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		driver.findElement(By.id("sb_form_go")).click();
		
	}
	@AfterTest
	public void TearDown()
	{
		driver.close();
	}

}

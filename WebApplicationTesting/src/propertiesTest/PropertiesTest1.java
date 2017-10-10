package propertiesTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertiesTest1 
{
	FirefoxDriver driver;
	@BeforeTest
	public void SetUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
	}
	@Test
	public void LinksTestWithProperties() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Kavya\\Desktop\\SeleniumKavya\\TestingProject\\src\\propertiesTest\\data.properties");
		Properties pr = new Properties();
		pr.load(file);
		
		driver.findElement(By.name(pr.getProperty("Username"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");
		driver.findElement(By.xpath(pr.getProperty("xpath"))).click();
		
		System.out.println("Login is successful");
		
		Sleeper.sleepTight(10);
	}
	@AfterTest
	public void TearDown()
	{
		driver.close();
		
		
		
	}

}

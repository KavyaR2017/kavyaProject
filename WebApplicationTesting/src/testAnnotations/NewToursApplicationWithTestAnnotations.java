package testAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursApplicationWithTestAnnotations 
{
	FirefoxDriver Driver;
	@BeforeTest
	public void SetUp()
	{
		Driver = new FirefoxDriver();
		Driver.get("http://newtours.demoaut.com");
		Driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	public void Login()
	{
		Driver.findElement(By.name("userName")).sendKeys("tutorial");
		Driver.findElement(By.name("password")).sendKeys("tutorial");
		Driver.findElement(By.name("login")).click();
		
		Sleeper.sleepTightInSeconds(10);
	}
	@AfterTest
	public void TearDown()
	{
		Driver.close();
	}

}

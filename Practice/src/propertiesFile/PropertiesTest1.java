package propertiesFile;

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
	public void PropertiesLinksTest() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Kavya\\Desktop\\SeleniumKavya\\Practice\\src\\propertiesFile\\Data.properties");
        Properties pr = new Properties();
        pr.load(file);
        driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
        driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");
        driver.findElement(By.xpath(pr.getProperty("xpath"))).click();
        
        Sleeper.sleepTight(10);
        
        String ExpectedTitle = "Find A Flight";
        String ActualTitle = driver.getTitle();
        
        System.out.println(ExpectedTitle);
        System.out.println(ActualTitle);
        
        if(ActualTitle.contains(ExpectedTitle))
        {
        	System.out.println("Login is successful - Pass");
        	
        }
        
        else
        {
        	System.out.println("Login is unsuccessful - Fail");
        }
	}
	@AfterTest
	public void TearDown()
	{
		driver.close();
	}
	

}

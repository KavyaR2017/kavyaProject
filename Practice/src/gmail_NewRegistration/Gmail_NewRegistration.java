package gmail_NewRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail_NewRegistration
{
	FirefoxDriver driver;
	
	@BeforeTest
	public void SetUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
	}
	@Test
	public void NewRegistration()
	{
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[2]/div")).click(); //more options
		Sleeper.sleepTightInSeconds(5);
		
		driver.findElement(By.className("jO7h3c")).click(); //create account
		Sleeper.sleepTightInSeconds(5);
		
		Actions act = new Actions(driver);
		WebElement FirstName = driver.findElement(By.id("FirstName"));
		act.moveToElement(FirstName).click();
		
		//driver.findElement(By.id("FirstName")).sendKeys("Kavya");//TC_01
		try
		{
			
		driver.findElement(By.id("submitbutton")).click(); //next step
		String ExpectedText = "You can't leave this empty."; //from FRS document
		String ActualText = driver.findElement(By.id("errormsg_0_LastName")).getText(); //firstname error msg Id
		
		
		if(ActualText.contains(ExpectedText))
		{
			System.out.println("Test Execution Successful - Pass");
		}}
		catch(Exception e)
		{
			System.out.println("Test Execution not Successful - Fail");
		}
		
		
		
		
		
		
		
		
	}
	@AfterTest
	public void TearDown()
	{
		driver.close();
	}

}

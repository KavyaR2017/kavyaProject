package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_UserRegistration
{
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void RegisterLinkTesting()
	{
		WebElement Register = driver.findElement(By.linkText("REGISTER"));
		Register.click();
	}
	
	
	
	@Test(priority=2)
	public void UserRegistration() throws InterruptedException
	{
		driver.findElement(By.name("firstName")).sendKeys("Kavya");
		driver.findElement(By.name("lastName")).sendKeys("Hello");
		driver.findElement(By.name("phone")).sendKeys("777777");
		driver.findElement(By.id("userName")).sendKeys("kavya@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("HiTech");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("50001");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		driver.findElement(By.id("email")).sendKeys("Kavyaaaaa");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
		
		Thread.sleep(10000);
		
		driver.findElement(By.name("register")).click();
		
		String ExpectedUserName = "Kavyaaaaa";
		
		String ActualUserData=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		
		
		if(ActualUserData.contains(ExpectedUserName))
		{
			System.out.println("User Registered Successfully = PASS");
		}
		else
		{
			System.out.println("User Not Registered Successfully - FAIL");
		}
		
		

}	
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}

	
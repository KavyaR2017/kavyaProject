package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnteringTextIntoSearch_Google 
{

	public static void main(String[] args) 
	{
		FirefoxDriver Driver = new FirefoxDriver();
		Driver.get("http://google.com");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("gs_htif0")).sendKeys("Selenium");
		Driver.findElement(By.id("gs_htif0")).click();
		
	}

}

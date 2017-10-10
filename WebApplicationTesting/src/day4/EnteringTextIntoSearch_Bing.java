package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnteringTextIntoSearch_Bing 
{

	public static void main(String[] args) 
	{
		FirefoxDriver Driver = new FirefoxDriver();
		Driver.get("http://bing.com");
		Driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");
		Driver.findElement(By.id("sb_form_go")).click();
		

	}

}

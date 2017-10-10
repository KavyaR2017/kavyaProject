package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_ClassName 
{

	public static void main(String[] args) 
	{
		FirefoxDriver Driver = new FirefoxDriver();
		Driver.get("http://google.com");
		Driver.manage().window().maximize();
		Driver.findElement(By.className("gsfi"));

	}

}

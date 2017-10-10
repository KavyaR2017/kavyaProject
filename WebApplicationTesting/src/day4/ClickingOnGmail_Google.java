package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickingOnGmail_Google 
{

	public static void main(String[] args) 
	{
		FirefoxDriver Driver = new FirefoxDriver();
		Driver.get("http://google.com");
		Driver.manage().window().maximize();
		Driver.findElement(By.linkText("Gmail")).click();
		System.out.println(Driver.getTitle());
		System.out.println(Driver.getCurrentUrl());
		Driver.close();
		

	}

}

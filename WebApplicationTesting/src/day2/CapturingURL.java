package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingURL 
{

	public static void main(String[] args) 
	{
		FirefoxDriver Driver = new FirefoxDriver();
		Driver.navigate().to("http://facebook.com");
		Driver.get("http://google.co.in");
		Driver.manage().window().maximize();
		System.out.println(Driver.getTitle());
		System.out.println(Driver.getCurrentUrl());
		Driver.close();

	}

}

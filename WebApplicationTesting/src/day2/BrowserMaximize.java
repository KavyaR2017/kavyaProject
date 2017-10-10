package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserMaximize
{

	public static void main(String[] args) 
	{
		FirefoxDriver Driver = new FirefoxDriver();
		Driver.navigate().to("http://google.co.in");
		Driver.get("http://facebook.com");
		Driver.manage().window().maximize();
		Driver.close();
		

	}

}

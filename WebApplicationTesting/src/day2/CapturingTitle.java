package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingTitle 
{

	public static void main(String[] args) 
	{
		FirefoxDriver Driver = new FirefoxDriver();
		
		Driver.get("http://google.co.in");
		Driver.navigate().to("http://facebook.com");
		Driver.manage().window().maximize();
		System.out.println(Driver.getTitle());
		Driver.close();

	}

}

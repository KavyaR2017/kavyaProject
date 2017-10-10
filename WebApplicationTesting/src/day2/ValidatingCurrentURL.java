package day2;

import org.apache.commons.el.EqualsOperator;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingCurrentURL 
{

	public static void main(String[] args) 
	{
		FirefoxDriver Driver = new FirefoxDriver();
		Driver.get("http://facebook.com");
		Driver.navigate().to("http://google.co.in");
		Driver.manage().window().maximize();
		String ExpectedTitle = "Google";
		String ExpectedURL = "google.co.in";
		String ActualTitle = Driver.getTitle();
		String ActualURL = Driver.getCurrentUrl();
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title matched - Pass");
		}
		else
		{
			System.out.println("Title not matched - Fail");
		}
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("URL matched - Pass");
		}
		else
		{
			System.out.println("URL mot matched - Fail");
		}
		if(ActualURL.contains(ExpectedURL))
		{
			System.out.println("URL matched - Pass");
		}
		else
		{
			System.out.println("URL mot matched - Fail");
		}
		
			
			
			

	}

}

package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatingToFacebookApplication 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.facebook.com/");
		driver.navigate().to("http://www.gmail.com/");

	}

}

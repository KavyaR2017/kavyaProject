package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting1_IdentifyingTotalLinks_Gmail 
{

	public static void main(String[] args) 
	{
		FirefoxDriver Driver = new FirefoxDriver();
		Driver.get("http://gmail.com");
		Driver.manage().window().maximize();
		List<WebElement>links=Driver.findElements(By.tagName("a")); //<WebElement> is used to store array elements of same type.But here we may have integer or string arrays. so used List which will be used to store both integer or string arrays
		System.out.println(links.size());
		Driver.close();

	}

}

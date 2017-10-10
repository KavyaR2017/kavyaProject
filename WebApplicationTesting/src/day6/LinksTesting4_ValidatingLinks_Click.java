package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting4_ValidatingLinks_Click 
{

	public static void main(String[] args) 
	{
		FirefoxDriver Driver = new FirefoxDriver();
		Driver.get("http://newtours.demoaut.com");
		Driver.manage().window().maximize();
		List<WebElement>links=Driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			
			System.out.println(Driver.getTitle());
			System.out.println(Driver.getCurrentUrl());
			
			Driver.navigate().back();
			links=Driver.findElements(By.tagName("a"));
			
			
			
		}
		Driver.close();
	}

}

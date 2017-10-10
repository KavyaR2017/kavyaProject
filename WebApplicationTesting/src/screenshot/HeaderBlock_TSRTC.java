package screenshot;








import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class HeaderBlock_TSRTC 
{

	public static void main(String[] args) 
	{
		FirefoxDriver Driver = new FirefoxDriver();
		Driver.get("http://tsrtconline.in/oprs-web/");
		Driver.manage().window().maximize();
		WebElement HeaderBlock = Driver.findElement(By.xpath("/html/body/div[3]"));
		List<WebElement>HeaderLinks = HeaderBlock.findElements(By.tagName("a"));
		System.out.println(HeaderLinks.size());
		for(int i=0;i<=HeaderLinks.size();i++)
		{
			System.out.println(HeaderLinks.get(i).getText());
			HeaderLinks.get(i).click();
			System.out.println(Driver.getCurrentUrl());
			System.out.println(Driver.getTitle());
			
			Driver.navigate().back();
			Sleeper.sleepTight(10);
			
			HeaderBlock = Driver.findElement(By.xpath("/html/body/div[3]"));
			HeaderLinks = HeaderBlock.findElements(By.tagName("a"));
			
			
			
			
			
			
		}
		Driver.close();
		

	}

} 


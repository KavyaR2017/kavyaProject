package mouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover1 
{

	public static void main(String[] args) 
	{
		FirefoxDriver Driver = new FirefoxDriver();
		Driver.get("http://www.livetech.in");
		Driver.manage().window().maximize();
		Actions act = new Actions(Driver); //have to perform click operation on online courses which is not directly visible on webpage
		WebElement Courses = Driver.findElement(By.linkText("Courses"));
		

	}

}

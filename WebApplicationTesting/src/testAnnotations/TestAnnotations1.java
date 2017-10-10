package testAnnotations;

import org.testng.annotations.Test;

public class TestAnnotations1 
{

	@Test(priority=1)
	public void BrowserLaunch()
	{
		System.out.println("This is used to launch the browser"); 
		 
	}
	@Test(priority=2)
	public void LogIn()
	{
		System.out.println("This is used to LogIn to the application");
	}
	@Test(priority=3)
	public void InBox()
	{
		System.out.println("This is used to test inbox functionality");
	}
	@Test(priority=4)
	public void SentMail()
	{
		System.out.println("This is used to test SentMail functionality");
	}

}

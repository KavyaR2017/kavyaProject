package testAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations2 
{
@BeforeTest
public void OpeningApplication()
{
	System.out.println("Opening Browser and Navigating to Application");
}
@Test(priority=1)
public void LogIn()
{
	System.out.println("Testing Login Functionality");
}
@Test(priority=2)
public void InBox()
{
	System.out.println("Testing Inbox Functionality");
}
@AfterTest
public void CloseApplication()
{
	System.out.println("Close the Application");
}

}

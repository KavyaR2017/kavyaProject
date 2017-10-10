package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Snippet2 {
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		
	    List <WebElement> rows1 = driver.findElements(By.xpath(".//div[@class='row']/table/tbody/tr")); 
	            System.out.println("No of rows are : " + rows1.size());
	            //No.of Columns
	            List <WebElement> col1 = driver.findElements(By.xpath(".//div[@class='row']/table/tbody/tr[1]/td"));
	            System.out.println("No of cols are : " +col1.size()); 
	            WebElement htmltable=driver.findElement(By.xpath("//div[@class='row']/table[1]/tbody"));
	    		
	    		List<WebElement> rows=htmltable.findElements(By.tagName("tr"));
	    	    System.out.println("No of rows are : " +rows.size()); 
	    	    int colcount=0;
	    	    for(int rnum=0;rnum<rows.size();rnum++)
	    	    	{
	    	    	List<WebElement> columns=rows.get(rnum).findElements(By.tagName("td"));
	    	    	colcount+=columns.size();
	    	    	//System.out.println("Number of columns:"+colcount);
	    	    	
	    	    	for(int cnum=0;cnum<columns.size();cnum++)
	    	    	{
	    	    		    	System.out.print(columns.get(cnum).getText()+"         ");
	    	    	}
	    	    	System.out.println();
	    	    	}
	            driver.close();
	}
}
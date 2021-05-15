package Library;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Pages.Home_Page;

public class BaseClass 
{
	WebDriver driver;
	
	
 public void mouseactions(WebElement element)
 {
	 Actions action = new Actions(driver);
	 action.moveToElement(element).build().perform();
 }
 
	public void windowhandle()
	{   
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> allwindows = driver.getWindowHandles();
		int windowSize = allwindows.size();
		for (String childwindow:allwindows)
		{
			if(!parentwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				driver.close();
			}
		}
		driver.switchTo().window(parentwindow);
		
	}
	
	public void dropdown(WebElement select)
	{
		Select inquirytype = new Select((WebElement) driver);
		inquirytype.selectByValue("LOAN DOCUMENTATION");
		Select country = new Select((WebElement) driver);
		country.selectByValue("INDIA");
		
	}
}
package Library;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Pages.Home_Page;

public class BaseClass 
{
	WebDriver driver;
	Home_Page ne = new Home_Page();
	
 public void mouseactions()
 {
	 Actions action = new Actions(driver);
	 action.moveToElement(null).build().perform();
 }
	public void windowhandle()
	{
		Set<String> allwindows = driver.getWindowHandles();
		int windowSize = allwindows.size();
		for (String childwindow:allwindows)
		{
			
		}
		
	}
	
	public void dropdown()
	{
		
	}
}

package Library;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



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
		 String mainwindow = driver.getWindowHandle();
		 Set<String> s1 = driver.getWindowHandles();
		 Iterator<String> i1 =s1.iterator();
		 while(i1.hasNext())
		 {
			 String childwindow = i1.next();
			 if(!mainwindow.equalsIgnoreCase(childwindow))
			 {
				 driver.switchTo().window(childwindow);
				
				 driver.close();
			}
		}
		driver.switchTo().window(mainwindow);
		
	}
	
	public void selectvaluefromdropdown(WebElement element,String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	
		
	}
	public void waitTillElementsPresent(WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
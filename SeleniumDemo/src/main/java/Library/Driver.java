package Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver extends Baseconfigue
{ 
	WebDriver driver;


	public void setup(String browser) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))	
		{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		
		}
		
		driver.manage().deleteAllCookies();
		
		
	}
	public void url_link(String url)
	{
		driver.get(url);
	}
	
	public void closeall()
	{
		driver.quit();
	}
	
}

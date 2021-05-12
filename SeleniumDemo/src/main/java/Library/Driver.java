package Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver 
{ 
	WebDriver driver=null;


	public void chrome() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfc.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"HomepageModalVideo\"]/div/div/div[1]/button")).click();
		
		}
	
	public void close()
	{
		driver.quit();
	}
	
}

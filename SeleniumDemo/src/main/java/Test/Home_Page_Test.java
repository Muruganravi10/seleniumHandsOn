package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Library.Baseconfigue;
import Library.Driver;
import Pages.Home_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Home_Page_Test extends Baseconfigue{
	WebDriver driver;


	Driver a = new Driver();
	Home_Page page = new Home_Page();

	@BeforeMethod
	 @Parameters({"browser","url"}) 

	public void url(String browser,String url) throws InterruptedException
	{

		a.setup(browser);
		a.url_link(url);
	}


	@Test(priority=1)
	public void Scenario_1() throws InterruptedException 
	{

		page.closepopup();
		page.clickloanproducts(); 
		page.clickhousingloan();
		String house = driver.getTitle();
		Assert.assertEquals("Housing Loan", house);
		page.clickotherloan();
		String other = driver.getTitle();
		Assert.assertEquals("Other Home Loan Products", other);
		page.clicknonhousingloan();
		String nonhouse = driver.getTitle();
		Assert.assertEquals("Non Housing Loan", nonhouse);

	}

	@Test(priority=2)
	public void Scenario_2()
	{
		page.clickonimage();
		String name = driver.getTitle();
		Assert.assertEquals("Housing Finance | Housing Finance Company in India | HDFC Ltd", name);

	}


	@Test(priority=3)
	public void Scenario_3()
	{ 

		page.depositepage(); 
		page.checksentences();
		page.apply();

	}

	@AfterMethod 
	public void close_browser() 
	{ 
		a.closeall(); 
	}


}

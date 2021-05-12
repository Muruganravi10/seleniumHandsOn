package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library.Driver;
import Pages.Home_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Home_Page_Test {

	Driver a = new Driver();
	Home_Page page = new Home_Page();

	@BeforeMethod
	public void url() throws InterruptedException
	{

		a.chrome();
	}
	@Test
	public void Scenario_1() throws InterruptedException
	{    

		page.clickloanproducts();
		System.out.println();
		page.clickhousingloan();
		page.clickotherloan();
		page.clicknonhousingloan();



	}
	@Test
	public void Scenario_2()
	{
		page.clickonimage();
	}
	@Test
	public void Scenario_3()
	{
		page.depositepage();
	}

	@AfterMethod 
	public void close_browser() 
	{ 
		a.close(); 
	}


}

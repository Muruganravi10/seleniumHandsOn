package Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Library.Baseconfigue;
import Library.Driver;
import Pages.Home_Page;

public class Home_Page_Test extends Baseconfigue{
	WebDriver driver;


	Driver drivers = new Driver();
	Home_Page page = new Home_Page();

	@BeforeMethod
	@Parameters({"browser","url"}) 

	public void url(String browser,String url) throws InterruptedException
	{

		drivers.setup(browser);
		drivers.url_link(url);
	}


	@Test(priority=1,groups = { "Regression" })
	public void Hdfc_Loan_Products() throws InterruptedException 
	{

		page.closePopUp();
		page.clickLoanProducts(); 
		String house = page.clickHousingLoan();
		Assert.assertEquals("Housing Loan", house);
		String other = page.clickOtherLoan();
		Assert.assertEquals("Other Home Loan Products", other);
		String nonhouse = page.clickNonHousingLoan();
		Assert.assertEquals("Non Housing Loan", nonhouse);

	}

	@Test(priority=2,groups = { "Smoke" })
	public void Hdfc_logo()
	{

		boolean flag = page.clickOnImage();
		Assert.assertTrue(flag);
	}


	@Test(priority=3,groups = { "Regression" })
	public void Hdfc_Deposits()
	{ 

		page.depositePage(); 
		String line = page.checkSentences();
		Assert.assertEquals(line, "Attractive returns and safety, in one Investment");
		boolean flag = page.apply();
		Assert.assertTrue(flag);


	}

	@AfterMethod 
	public void close_browser() 
	{ 
		drivers.closeall(); 
	}


}

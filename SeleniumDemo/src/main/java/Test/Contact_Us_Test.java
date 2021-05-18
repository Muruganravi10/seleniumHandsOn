package Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Library.Driver;
import Pages.Contact_Us;


public class Contact_Us_Test 
{
 WebDriver driver;	

 Driver a = new Driver();
	Contact_Us c = new Contact_Us();
	
	@BeforeMethod
	@Parameters({"browser","url"})

	public void url(String browser,String url) throws InterruptedException
	{

		a.setup(browser);
		a.url_link(url);
	}

	
    @Test(priority=1)
	public void scenario_1() throws InterruptedException
	{   
	    c.closepopup();
		c.move_contactus();
		c.move_writeus();
		c.move_helplineno();
		c.move_locateUs();
		c.move_grievence();
		c.move_hdfccoperate();
		c.move_hdfcdeposite();
	}
	
	@Test(priority=2)
	public void scenario_2()
	{
		c.closepopup();
		c.move_contactus();
		c.move_writeus();
		c.closepopup();
		c.selectinquiry();
		c.subcategory();
		c.namefill();
		c.emailfill();
		c.selectcountry();
		c.selectstate();
		c.selectcity();
		c.selectbranch();
		c.contactnofill();
		c.addressfill();
		c.homeaccountfill();
		c.queryfill();
		c.checkbox();
		c.submitbutton();
        c.error();
        Assert.assertEquals("Please enter a valid Home Loan Account No.","vtdr");
	
	    
	}
	
	@AfterMethod
	public void close_browser() 
	{ 
		a.closeall(); 
	}


}

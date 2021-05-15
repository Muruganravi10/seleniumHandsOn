package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Library.Driver;
import Pages.Login_Page;

public class Login_Page_Test {

	@DataProvider(name = "test-data")
	public Object[][] dataProvFunc(){
		return new Object[][]{
			{"murugan","25yydss"},{"moses","Bangalore"},{"usha","Chennai"}
		};
	}


	Driver a = new Driver();
	Login_Page b = new Login_Page();

	@BeforeMethod
	@Parameters({"browser","url"})

	public void url(String browser,String url) throws InterruptedException
	{

		a.setup(browser);
		a.url_link(url);
	}

	@Test(dataProvider ="test-data")	
	public void Scenario(String username,String password)
	{

		b.closepopup();
		b.clickexistingcustomer();	
		b.clickhomeloan();
		b.clickcustomerlogin(); 
		b.clickuserId();
		b.clickloanaccountNo(username);
		b.clickpassword(password);
		b.clickloginbutton();
		b.validateerrormessage();
		String str = new String (b.validateerrormessage());
		Assert.assertEquals("str", "Invalid User Id Or Password");
		b.close();
		b.gettitle();

	}

	@AfterMethod 
	public void close_browser()
	{ 
		a.closeall();

	}



}

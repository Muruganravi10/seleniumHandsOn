package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library.Driver;
import Pages.Login_Page;

public class Login_Page_Test {
	Driver a = new Driver();
	Login_Page b= new Login_Page();
	
	@BeforeMethod
	public void url() throws InterruptedException
	{

		a.chrome();
	}
	@Test
	public void Scenario()
	{
		
		b.clickexistingcustomer();
		/*
		 * b.clickhomeloan(); b.clickcustomerlogin(); b.clickuserId();
		 * b.clickloanaccountNo(); b.clickpassword(); b.clickloginbutton();
		 * b.validateerrormessage();
		 */
	}
	
	 @AfterMethod 
	 public void close_browser()
	 { a.close();
	 
	 }
	 

	
}

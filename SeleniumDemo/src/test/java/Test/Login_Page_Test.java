package Test;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Library.Driver;
import Library.ExcelUtility;
import Pages.Login_Page;

public class Login_Page_Test {


	String sheetName = "sheet1";
	ExcelUtility excel;
	Driver drivers = new Driver();
	Login_Page page = new Login_Page();

	@BeforeMethod
	@Parameters({"browser","url"})
	public void url(String browser,String url) throws InterruptedException
	{

		drivers.setup(browser);
		drivers.url_link(url);
	}

	@DataProvider
	public Object[][] getTestData(){
		Object data[][] = ExcelUtility.getTestData(sheetName);
		return data;
	}

	@Test(priority=1, dataProvider="getTestData",groups = { "Smoke" })
	public void Hdfc_Customer_Login(String username,String password) throws IOException
	{

		page.closePopUp();
		page.clickExistingCustomer();	
		page.clickHomeLoan();
		String message= page.customerLogin(username, password); 
		Assert.assertEquals(message, "Invalid User Id Or Password");
		String title = page.gettitle();
		Assert.assertEquals(title, "Housing Finance | Housing Finance Company in India | HDFC Ltd");

	}

	@AfterMethod 
	public void close_browser()
	{ 
		drivers.closeall();

	}



}

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

 Driver drivers = new Driver();
	Contact_Us page = new Contact_Us();
	
	@BeforeMethod
	@Parameters({"browser","url"})

	public void url(String browser,String url) throws InterruptedException
	{

		drivers.setup(browser);
		drivers.url_link(url);
	}

	
    @Test(priority=1,groups = { "Smoke" })
	public void Hdfc_Contact_Us() throws InterruptedException
	{   
    	page.closepopup();
    	page.moveContactUs();
    	String write = page.moveWriteUs();
    	Assert.assertEquals(write, "Write to us");
    	String help= page.moveHelplineNo();
    	Assert.assertEquals(help, "Helpline Numbers");
    	String locate = page.moveLocateUs();
    	Assert.assertEquals(locate, "Locate us");
    	String grievence =page.moveGrievence();
    	Assert.assertEquals(grievence, "Grievance Redressal");
    	String coperate= page.moveHdfcCoperate();
    	Assert.assertEquals(coperate, "HDFC Corporate Office");
    	String deposite =page.moveHdfcDeposite();
    	Assert.assertEquals(deposite, "HDFC Deposit Centers");
	}
	
	@Test(priority=2,groups = { "Regression" })
	public void Hdfc_Write_to_Us()
	{
		page.closepopup();
		page.moveContactUs();
		String errormsg = page.writeUs();
        Assert.assertEquals(errormsg,"Please enter a valid Home Loan Account No.");
	
	    
	}
	
	@AfterMethod
	public void close_browser() 
	{ 
		drivers.closeall(); 
	}


}

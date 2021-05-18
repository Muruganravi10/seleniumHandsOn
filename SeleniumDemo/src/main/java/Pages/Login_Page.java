package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Library.BaseClass;
import Library.Baseconfigue;
import Library.ExcelUtility;

public class Login_Page extends BaseClass
{   
	ExcelUtility excel = new ExcelUtility();
	WebDriver driver;


	public void homepage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//*[@id=\"HomepageModalVideo\"]/div/div/div[1]/button")
	private WebElement buttonclosed;
	
	@FindBy(xpath="//*[@id=\"navbarDropdown\"]")
	private WebElement existingcustomer;

	@FindBy(xpath="\"//*[@id=\"existing-customer-menu\"]/li/ul/li[1]/a\"")
	private WebElement homeloan;

	@FindBy(xpath="//*[@id=\"existing-customer-menu\"]/li/ul/li[1]/ul/li[2]/a")
	private WebElement customerlogin;

	@FindBy(xpath="//*[@id=\"withlogin\"]")
	private WebElement userId;

	@FindBy(xpath="//*[@id=\"loginForm\"]/div/div[1]/div/input")
	private WebElement loanaccountNo; 

	@FindBy(id="password")
	private WebElement passwords; 

	@FindBy(xpath="//*[@id=\"loginForm\"]/div/div[4]/button")
	private WebElement loginbutton; 

	@FindBy(xpath="//*[@id=\"login_box\"]/span")
	private WebElement errormessage; 
	/** Invalid User Id Or Password. 
	 * @return */

	public void closepopup()
	{

		buttonclosed.click();
	}

	public void clickexistingcustomer()
	{
		mouseactions(existingcustomer);
		System.out.println(existingcustomer.getText());


	}

	public void clickhomeloan()
	{
		mouseactions(homeloan);
		System.out.println(homeloan.getText());

	}

	public void clickcustomerlogin()
	{
		mouseactions(customerlogin);
		System.out.println(customerlogin.getText());

	}

	public void clickuserId()
	{
		userId.click();
	}

	public void clickloanaccountNo(String username) throws IOException
	{
		loanaccountNo.sendKeys(username);
	}


	public void clickpassword(String password) throws IOException
	{
		passwords.sendKeys(password);
	}

	public void clickloginbutton()
	{
		loginbutton.click();
	}
	public String validateerrormessage()
	{
		String str= errormessage.getText();
		return str;

	}

	public void close() {

		driver.close();

	}
	public void gettitle()
	{
		String e = driver.getTitle();
		System.out.println(e);
	}



}

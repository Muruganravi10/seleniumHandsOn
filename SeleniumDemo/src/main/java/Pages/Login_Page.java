package Pages;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Library.BaseClass;
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

	public void closePopUp()
	{

		buttonclosed.click();
	}

	public void clickExistingCustomer()
	{
		mouseactions(existingcustomer);
		System.out.println(existingcustomer.getText());


	}

	public void clickHomeLoan()
	{
		mouseactions(homeloan);
		System.out.println(homeloan.getText());

	}

	public String customerLogin(String username,String password)
	{
		mouseactions(customerlogin);
		customerlogin.click();

		String mainwindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 =s1.iterator();
		while(i1.hasNext())
		{
			String childwindow = i1.next();
			if(!mainwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				userId.click();
				loanaccountNo.sendKeys(username);
				passwords.sendKeys(password);
				loginbutton.click();
				errormessage.getText();
				driver.close();
			}
		}
		driver.switchTo().window(mainwindow);
		return errormessage.getText();

	}

	public String gettitle()
	{
		return driver.getTitle();

	}
}

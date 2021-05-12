package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
WebDriver driver;


public void homepage()
{
	PageFactory.initElements(driver, this);
}

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
private WebElement password; 

@FindBy(xpath="//*[@id=\"loginForm\"]/div/div[4]/button")
private WebElement loginbutton; 

@FindBy(xpath="//*[@id=\"login_box\"]/span")
private WebElement errormessage; 
/** Invalid User Id Or Password. 
 * @return */
/* use windowhandles and get title */

public void clickexistingcustomer()
{
	existingcustomer.click();

}

 public void clickhomeloan()
 {
	 homeloan.click();
 }
 
 public void clickcustomerlogin()
 {
	 customerlogin.click();
 }
 
 public void clickuserId()
 {
	 userId.click();
 }
 
 public void clickloanaccountNo()
 {
	 loanaccountNo.sendKeys("dfaerfgre");
 }
 
 
 public void clickpassword()
 {
	 password.sendKeys("2132454");
 }
 
 public void clickloginbutton()
 {
	 loginbutton.click();
 }
 public void validateerrormessage()
 {
	 errormessage.click();
 }
}

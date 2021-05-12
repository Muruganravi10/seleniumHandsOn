package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Library.BaseClass;

public class Home_Page
{
 WebDriver driver=null;
 BaseClass mouse = new BaseClass();
 
 public void homepage()
 {
	PageFactory.initElements(driver, this);
 }
 

 @FindBy(id="navbarDropdown")
  private WebElement loanproductTab;
 
 @FindBy(xpath ="//*[@id=\"primary-menu\"]/li[1]/div/div[1]/ul[1]/li[1]/a")
 private WebElement housingloanTab;
 
 @FindBy(xpath ="//*[@id=\"primary-menu\"]/li[1]/div/div[1]/ul[2]/li[1]/a")
 private WebElement otherloanTab;
 
 @FindBy(xpath ="//*[@id=\"primary-menu\"]/li[1]/div/div[1]/ul[3]/li[1]/a")
 private WebElement nonhousingloanTab;
 
 @FindBy(xpath ="//*[@id=\"navbar\"]/div/div[1]/div/a/img")
 private WebElement hdfcimage;
 
 @FindBy(xpath ="//*[@id=\"primary-menu\"]/li[3]/a")
 private WebElement deposite;
 
 @FindBy(className = "btn btn-danger text-uppercase")
 private WebElement applybutton;
 

 
 public void clickloanproducts()
 {

	 Actions action = new Actions(driver);
	 action.moveToElement(loanproductTab).build().perform();
	 System.out.println(loanproductTab.getText());
	 
 }
 
 public void clickhousingloan()
 {   
	 Actions action = new Actions(driver);
	 action.moveToElement(housingloanTab).build().perform();
	 
 }
 public void clickotherloan()
 {   
	 Actions action = new Actions(driver);
	 action.moveToElement(otherloanTab).build().perform();
	
 }
 public void clicknonhousingloan()
 {   
	 Actions action = new Actions(driver);
	 action.moveToElement(nonhousingloanTab).build().perform();
	
 }
 public void clickonimage()
 {  
	 Actions action = new Actions(driver);
	 action.moveToElement(hdfcimage).build().perform();

 }
 public void depositepage()
 {
	 deposite.click();
 }
 public void apply()
 {
	 Actions action = new Actions(driver);
	 action.moveToElement(applybutton).build().perform();
 }
}
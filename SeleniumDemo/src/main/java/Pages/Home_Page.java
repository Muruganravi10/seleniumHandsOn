package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Library.BaseClass;

public class Home_Page extends BaseClass
{
	WebDriver driver;


	public void homepage()
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath ="//*[@id=\"HomepageModalVideo\"]/div/div/div[1]/button")
	private WebElement buttonclosed;
	
	@FindBy(xpath="(//*[@title='Loan Products'])[2]")
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

	@FindBy(xpath="//*[@id=\"block-hdfcbannerblock\"]/div/div/div/div/div[1]/div[1]/h2")
	private WebElement check;

	@FindBy(xpath ="//*[@id=\"block-hdfcbannerblock\"]/div/div/div/div/div[1]/div[2]")
	private WebElement applybutton;


	public void closepopup()
	{

		buttonclosed.click();
	}

	public void clickloanproducts()
	{

		mouseactions(loanproductTab);
		System.out.println(loanproductTab.getText());

	}

	public void clickhousingloan()
	{   
		mouseactions(housingloanTab);
		System.out.println(housingloanTab.getText());

	}
	public void clickotherloan()
	{  
		mouseactions(otherloanTab);
		System.out.println(otherloanTab.getText());

	}
	public void clicknonhousingloan()
	{   
		mouseactions(nonhousingloanTab);
		System.out.println(nonhousingloanTab.getText());

	}
	public void clickonimage()
	{   
		hdfcimage.click();


	}
	public void depositepage()
	{
		deposite.click();
	}

	public void checksentences()
	{
		check.isDisplayed();
		check.getText();
	}
	public void apply()
	{
		applybutton.isEnabled();
		applybutton.getText();
	}
}
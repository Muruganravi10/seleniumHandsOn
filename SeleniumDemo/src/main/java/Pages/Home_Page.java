package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Library.BaseClass;

public class Home_Page extends BaseClass
{
	WebDriver driver;


	public void homePage()
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


	public void closePopUp()
	{

		buttonclosed.click();
	}

	public void clickLoanProducts()
	{

		mouseactions(loanproductTab);
		System.out.println(loanproductTab.getText());

	}

	public String clickHousingLoan()
	{   
		mouseactions(housingloanTab);
		return housingloanTab.getText();

	}
	public String clickOtherLoan()
	{  
		mouseactions(otherloanTab);
		return otherloanTab.getText();

	}
	public String clickNonHousingLoan()
	{   
		mouseactions(nonhousingloanTab);
		return nonhousingloanTab.getText();

	}
	public boolean clickOnImage()
	{   

	return hdfcimage.isDisplayed();


	}
	public void depositePage()
	{
		deposite.click();
	}

	public String checkSentences()
	{
		return check.getText();

	}
	public boolean apply()
	{
		return applybutton.isEnabled();
		
	}	
}
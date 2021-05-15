package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Library.BaseClass;
import Library.Baseconfigue;

public class Contact_Us extends BaseClass
{  
	Baseconfigue call= new Baseconfigue();
	
	WebDriver driver;
	public void contactUs_Page()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//*[@id=\"navbarDropdown\"]")
	private WebElement contactUs;

	@FindBy(xpath ="//*[@id=\"primary-menu\"]/li[5]/div/div[1]/ul/li[1]/a/span")
	private WebElement writeUs;

	@FindBy(xpath ="//*[@id=\"primary-menu\"]/li[5]/div/div[1]/ul/li[2]/a/span")
	private WebElement helplineno;

	@FindBy(xpath ="//*[@id=\"primary-menu\"]/li[5]/div/div[1]/ul/li[3]/a/span")
	private WebElement locateUs;

	@FindBy(xpath ="//*[@id=\"primary-menu\"]/li[5]/div/div[1]/ul/li[4]/a")
	private WebElement grievence;

	@FindBy(xpath ="//*[@id=\"primary-menu\"]/li[5]/div/div[1]/ul/li[5]/a/span")
	private WebElement hdfccoperate;

	@FindBy(xpath ="//*[@id=\"primary-menu\"]/li[5]/div/div[1]/ul/li[6]/a/span")
	private WebElement hdfcdeposite;

	@FindBy(xpath ="//*[@id=\"HomepageModalVideo\"]/div/div/div[1]/button")
	private WebElement buttonclosed;

	@FindBy(id="edit-category")
	private WebElement inquiry;

	@FindBy(id="edit-sub-category--zP5ErqXRhJk")
	private WebElement category;
	
	@FindBy(id="edit-customername")
	private WebElement name;

	@FindBy(id="edit-emailid")
	private WebElement emailid;

	@FindBy(id="edit-branch-country")
	private WebElement country;

	@FindBy(id="edit-location--4JlWsWr5pyA")
	private WebElement state;
	
	@FindBy(id="edit-servicecenter--rEdbLaOH_68")
	private WebElement city;
	
	@FindBy(id="edit-branch--lIuyfQP-Nz0")
	private WebElement branch;
	
	
	@FindBy(id="edit-contactno")
	private WebElement contactno;

	@FindBy(id="edit-address")
	private WebElement address;

	@FindBy(id="edit-file-lac-dep-no")
	private WebElement homeloanaccountno;

	@FindBy(id="edit-interactiondetails")
	private WebElement query;

	@FindBy(xpath="//*[@id=\"webform-submission-write-to-us-node-218-add-form\"]/div[14]/label")
	private WebElement checkbox;

	@FindBy(id="edit-submit")
	private WebElement submit;
	
	@FindBy(xpath="//*[@id=\"webform-submission-write-to-us-node-218-add-form--2xoEP1v3yNw\"]/div[12]/div")
	private WebElement errormsg;


	public void move_contactus()
	{

		mouseactions(contactUs);
		System.out.println(contactUs.getText());

	}
	public void move_writeus()
	{
		mouseactions(writeUs);
		System.out.println(writeUs.getText());

	}
	public void move_helplineno()
	{
		mouseactions(helplineno);
		System.out.println(helplineno.getText());

	}
	public void move_locateUs()
	{
		mouseactions(locateUs);
		System.out.println(locateUs.getText());

	}
	public void move_grievence()
	{
		mouseactions(grievence);
		System.out.println(grievence.getText());

	}
	public void move_hdfccoperate()
	{
		mouseactions(hdfccoperate);
		System.out.println(hdfccoperate.getText());

	}
	public void move_hdfcdeposite()
	{
		mouseactions(hdfcdeposite);
		System.out.println(hdfcdeposite.getText());

	}
	public void closepopup()
	{

		buttonclosed.click();
	}
	public void selectinquiry()
	{   

		Select inquirytype = new Select(inquiry);
		inquirytype.selectByValue("LOAN DOCUMENTATION");

	}
	public void subcategory()
	{   

		Select inquirytype = new Select(category);
		inquirytype.selectByValue("LOAN AGREEMENT CLAUSES");

	}
	public void namefill()
	{
		name.sendKeys(call.properties.getProperty("name"));
	}
	public void emailfill()
	{
		emailid.sendKeys(call.properties.getProperty("email"));
	}
	public void selectcountry()
	{
		Select country1 = new Select(country);
		country1.selectByValue("INDIA");
	}
	
	public void selectstate()
	{
		Select country1 = new Select(state);
		country1.selectByValue("PUDUCHERRY");
	}
	
	public void selectcity()
	{
		Select country1 = new Select(city);
		country1.selectByValue("PUDUCHERRY CITY");
	}
	
	public void selectbranch()
	{
		Select country1 = new Select(branch);
		country1.selectByValue("CHENNAI/305");
	}
	public void contactnofill()
	{
		contactno.sendKeys(call.properties.getProperty("contactno"));
	}
	public void addressfill()
	{
		address.sendKeys(call.properties.getProperty("address"));
	}
	public void homeaccountfill()
	{
		homeloanaccountno.sendKeys(call.properties.getProperty("homeloanaccountno"));
	}
	public void queryfill()
	{
		query.sendKeys(call.properties.getProperty("querys"));	
	}
	public void checkbox()
	{
		checkbox.click();
	}
	public void submitbutton()
	{
		submit.click();
	}
	public void error()
	{
		errormsg.getText();
		System.out.println(errormsg.getText());
	}
}

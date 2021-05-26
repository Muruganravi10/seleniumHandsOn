package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Library.BaseClass;
import Library.Baseconfigue;

public class Contact_Us extends BaseClass
{  


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


	public void moveContactUs()
	{

		mouseactions(contactUs);
		System.out.println(contactUs.getText());

	}
	public String moveWriteUs()
	{
		mouseactions(writeUs);
		return writeUs.getText();

	}
	public void clickWriteUs()
	{
		writeUs.click();


	}
	public String moveHelplineNo()
	{
		mouseactions(helplineno);
		return helplineno.getText();


	}
	public String moveLocateUs()
	{
		mouseactions(locateUs);
		return locateUs.getText();


	}
	public String moveGrievence()
	{
		mouseactions(grievence);
		return grievence.getText();


	}
	public String moveHdfcCoperate()
	{
		mouseactions(hdfccoperate);
		return hdfccoperate.getText();


	}
	public String moveHdfcDeposite()
	{
		mouseactions(hdfcdeposite);
		return hdfcdeposite.getText();


	}
	public String writeUs()
	{
		String mainwindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 =s1.iterator();
		while(i1.hasNext())
		{
			String childwindow = i1.next();
			if(!mainwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				buttonclosed.click();
				selectvaluefromdropdown(inquiry,"LOAN DOCUMENTATION");
				selectvaluefromdropdown(category,"LOAN AGREEMENT CLAUSES");
				name.sendKeys(Baseconfigue.properties.getProperty("name"));
				emailid.sendKeys(Baseconfigue.properties.getProperty("email"));
				selectvaluefromdropdown(country,"INDIA");
				selectvaluefromdropdown(state,"PUDUCHERRY");
				selectvaluefromdropdown(city,"PUDUCHERRY CITY");
				selectvaluefromdropdown(branch,"CHENNAI/305");
				contactno.sendKeys(Baseconfigue.properties.getProperty("contactno"));
				address.sendKeys(Baseconfigue.properties.getProperty("address"));
				homeloanaccountno.sendKeys(Baseconfigue.properties.getProperty("homeloanaccountno"));
				query.sendKeys(Baseconfigue.properties.getProperty("querys"));	
				checkbox.click();
				submit.click();
				errormsg.getText();
			}
		}
		driver.switchTo().window(mainwindow);
		return errormsg.getText();

	}
	public void closepopup() {
		buttonclosed.click();

	}

}

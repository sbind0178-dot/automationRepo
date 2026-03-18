package VtigerAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericMethods.WeUtiles;

public class LeadCreatePage {

	WebDriver driver;
	WeUtiles we = new WeUtiles();

	public LeadCreatePage(WebDriver edriver) {
		this.driver = edriver;
		PageFactory.initElements(edriver, this);

	}

	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement FirstNamexpath;

	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement LastNamexpath;

	@FindBy(xpath = "//input[@name='company']")
	public WebElement compnynamexpath;

	@FindBy(xpath = "//input[@id='designation']")
	public WebElement titlenamexpath;

	@FindBy(xpath = "//input[@id='mobile']")
	public WebElement mobilexpath;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailxpath;

	@FindBy(xpath = "//textarea[@name='description']")
	public WebElement Descriptionxpath;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	public WebElement savexpath;
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	public	WebElement  getext;
	

	public void enterFirstName(String firstName) {
		we.Sendkey(FirstNamexpath, firstName);
	}
 
	public void enterLastName(String lastName) {
		we.Sendkey(LastNamexpath, lastName);
	}
	
	public void enterCompany(String company) {
		we.Sendkey(compnynamexpath, company);
	}
	
	public void enterEmail(String email) {
		we.Sendkey(emailxpath, email);
	}
	
	public void enterMobileNumber(String mobile) {
		we.Sendkey(mobilexpath, mobile);
	}
	
	public void clickOnSaveButton() {
		we.click(savexpath);
	}
	
	
	
	

	public void validate() {
		we.validateTextEquals(getext, "[ LEA9 ] bind sunil -  Lead Information");
	}
	
}

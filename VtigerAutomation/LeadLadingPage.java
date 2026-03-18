package VtigerAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericMethods.WeUtiles;

public class LeadLadingPage {

	WebDriver driver;
	WeUtiles we =new WeUtiles();


	public LeadLadingPage(WebDriver edriver) {
		this.driver=edriver;
		PageFactory.initElements(edriver, this);
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	public	WebElement xapthPlushButton;

	public void clickOnPlusbutton() {

		we.click(xapthPlushButton);

	}




}

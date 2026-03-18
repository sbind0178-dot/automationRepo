package VtigerAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericMethods.WeUtiles;

public class HomePage {

	WebDriver driver;
	WeUtiles we =new WeUtiles();


	public HomePage(WebDriver edriver) {
		this.driver=edriver;
		PageFactory.initElements(edriver, this);

	}
	
	
	@FindBy(xpath="//a[@href='index.php?module=Leads&action=index']")
	WebElement LeadClickxpath;
		
	
	public  void LeadClick() {
		we.click(LeadClickxpath);
		
		
	}
	
	
	
		
}



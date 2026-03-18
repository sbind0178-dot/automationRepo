package VtigerAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericMethods.WeUtiles;

public class LeadDitailepage {

	WebDriver driver;
	WeUtiles we =new WeUtiles();


	public LeadDitailepage(WebDriver edriver) {
		this.driver=edriver;
		PageFactory.initElements(edriver, this);
	}
	@FindBy(xpath="//a[text()='Leads']")
       public	WebElement Leadclick;            
	
	@FindBy(xpath="//a[text()='ajay']")
	WebElement ajayclickLogin;
	
	//WebElement LeadPageclick=driver.findElement(By.xpath(Leadclick));
	//WebElement ajayclick=driver.findElement(By.xpath(ajayclickLogin)) ;
		
	public void DaitalePage() {
		
	}
}

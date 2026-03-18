package VtigerAutomation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericMethods.WeUtiles;

public class LoginPage {


	WebDriver driver;
	WeUtiles we =new WeUtiles();


	public LoginPage(WebDriver edriver) {
		this.driver=edriver;
		PageFactory.initElements(edriver, this);

	}


	@FindBy(xpath="//input[@name='user_name']")
	public	WebElement Username;
	
	@FindBy (xpath="//input[@name='user_password']")
	public	WebElement userpassword;
	
	@FindBy(xpath="//input[@id='submitButton']")
	public	WebElement login;


	//WebElement userName=driver.findElement(By.xpath(usernamexpath));
	//WebElement userPassword=driver.findElement(By.xpath(userPasswordxpath));
	//WebElement login=driver.findElement(By.xpath(loginxpath));

	public void validLogin(String userName, String userPassword) {
		we.Sendkey(Username, userName);
		we.Sendkey(userpassword, userPassword);
		we.click(login);

	}

	public void invalidLogin(String username_Value,String userpassword_Value) {

		we.Sendkey(Username, userpassword_Value);
		we.Sendkey(userpassword, userpassword_Value);
		we.click(login);



	}



}

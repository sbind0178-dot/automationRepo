package selenium_prictis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Filter_leads {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();

		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();

		WebElement webusername=	driver.findElement(By.xpath("//input[@name='user_name']"));
		webusername.sendKeys("admin");

		WebElement webpassword=	driver.findElement(By.xpath("//input[@name='user_password']"));
		webpassword.sendKeys("admin");

		WebElement weLoginbotton=	driver.findElement(By.xpath("//input[@id='submitButton']"));
		weLoginbotton.click();

		WebElement weLeadsbotton=  driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		weLeadsbotton.click();


		WebElement weFilDropdown=driver.findElement(By.name("viewname"));
		if(weFilDropdown.isDisplayed () & weFilDropdown.isEnabled() ==true) {

			System.out.println("user of Display and Enabled is visible ----passed");
		}else{
			System.out.println("user of Display and Enabled is not visible ----failed");

		}
		Select selobj=new Select(weFilDropdown);
	WebElement ab	=selobj.getFirstSelectedOption();
		String sgettect=ab.getText();
		System.out.println("get text---"+sgettect);
		
		selobj.selectByVisibleText("This Month Leads");
	
		selobj.selectByIndex(2);
		selobj.selectByValue("1");
		
WebElement adall= selobj.getFirstSelectedOption();

  String sgettext=adall.getText();

  
  System.out.println("get text---"+sgettext);
  
		if(sgettect.equals("All")  )   {

			System.out.println("user of change to Hot leads---passed");
		}else{
			System.out.println("user of change to not Hot leads---failed");


		}

	}
}






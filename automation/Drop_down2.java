package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down2 {


	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();


		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();

		WebElement webusername= driver.findElement(By.xpath("//input[@name='user_name']"));
		
		webusername.sendKeys("admin");
		WebElement webuserpassword= driver.findElement(By.xpath("//input[@name='user_password']"));
		webuserpassword.sendKeys("admin");
		WebElement webloginboutton=  driver.findElement(By.xpath("//input[@type='submit']"));
		webloginboutton.click();

		WebElement webleads=   driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		webleads.click();

		WebElement web_Searchfor=driver.findElement(By.xpath("//input[@name='search_text']"));
		web_Searchfor.sendKeys("mary");
		WebElement webinDD=	driver.findElement(By.id("bas_searchfield"));	

		Select inselect=new Select(webinDD);
		//	inselect.selectByVisibleText("First Name");     ///sabse jyaja yahi use hota hai .1
		Thread.sleep(3000);
		inselect.selectByIndex(4);      ////sabse jyaja yahi use hota hai int type ka  .2

		/// drop down - tag - select
		///child item -tag - option --innertext  attribute  -value

		//	inselect.selectByValue("firstname");

		inselect.selectByContainsVisibleText("Firs");         ///sabse jyaja yahi use hota hai .3
		// dropdown -single select .multi select

//		
//		boolean status=	inselect.isMultiple();
//		System.out.println(status);
//			inselect.deSelectByContainsVisibleText("Firs");
//
//			int dropdownoption=	inselect.getOptions().size();    
//			System.out.println(dropdownoption);

	}

}

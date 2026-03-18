package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://localhost:8888/");

		WebElement webusername=	driver.findElement(By.xpath("//input[@name='user_name']"));
		webusername.sendKeys("admin");

		WebElement webpassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		webpassword.sendKeys("admin");

		WebElement welogin=driver.findElement(By.xpath("//input[@id='submitButton']"));
		welogin.click();

		Actions actobj=new Actions(driver);

		WebElement wemore= driver.findElement(By.xpath("//a[text()='More']"));

		actobj.moveToElement(wemore).click(wemore).build().perform();

		// here you have create object of Actions class
		// after that you called moveToElement method of this class
		// band method return object of actions class itself

		actobj.contextClick(wemore).perform();

		actobj.doubleClick(wemore).perform();

		actobj.clickAndHold(wemore).perform();

		// Common problem
		// either work
		// or not work - exception---
		//                                	NoSuchElementException
		//                             StaleElementRefernceException
		//                              any other exception
		//        No work -- No Exception

		WebElement weSerchbox=driver.findElement(By.xpath("//input[@name='query_string']"));
	//	weSerchbox.sendKeys("Fare");
		actobj.sendKeys(weSerchbox, "sunil").perform();

///Drag and Drop use


		/// cross hair
		///
		
//		WebElement weDrag=	driver.findElement(By.xpath("//b[contains(text(),'Pending Activities')]"));
//            
//		WebElement weDrop= driver.findElement(By.xpath("//b[contains(text(),'My New Leads')]"));
//      Thread.sleep(3000);
//		actobj.clickAndHold(weDrag).moveToElement(weDrop).release().build().perform();

//		WebElement weCalender= driver.findElement(By.linkText("Leads"));
//		actobj.click(weCalender).build().perform();

		 Thread.sleep(3000);
		actobj.scrollByAmount(100, 2200).build().perform();
		actobj.scrollToElement(weSerchbox).build().perform();     //upar se down go in method use

		 
	
		
	}


}

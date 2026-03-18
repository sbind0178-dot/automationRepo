package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger_testcase3 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();

		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		// case 1. user name
		WebElement webusername= driver.findElement( By.xpath("//input[@name='user_name']"));	//	By.xpath("//input[@name='user_name']");
		webusername.sendKeys("admin");
		String attribute =webusername.getAttribute("value");
		System.out.println("valid user name---" + attribute);

		// case 2. user password
		WebElement webuserpassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		webuserpassword.sendKeys("admin");
		String attributevalue= webuserpassword.getAttribute("value");
		System.out.println("valid user password---" + attributevalue);	

		// case 3. login bouttob
		WebElement webboutton=     driver.findElement(By.xpath("//input[@id='submitButton']"));
		webboutton.click();

		// case 4.leads click
		WebElement webleads=   driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		webleads.click();

		// case 5.add click
		WebElement webaddclick=   driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		webaddclick.click();

		WebElement webmrnameuse=   driver.findElement(By.xpath("//select[@name='salutationtype']"));
		webmrnameuse.sendKeys("mr");

		// case 6.wrong name is clear
		WebElement webFirsrname=    driver.findElement(By.xpath("//input[@name='firstname']"));
		webFirsrname.sendKeys("rakesh ");
		String aname=	webFirsrname.getAttribute("value");
		System.out.println("I have sent worng user first Name---"+aname);
		Thread.sleep(1000);
		webFirsrname.clear();

		// case 7. user  name is correct
		webFirsrname.sendKeys("sunil ");
		String aname1=	webFirsrname.getAttribute("value");
		System.out.println("I have resent user  First Name---"+aname1);

		// case 8. last name worng
		WebElement weblastusername=   driver.findElement(By.xpath("//input[@name='lastname']"));
		weblastusername.sendKeys("yadav");
		String lastworngname= weblastusername.getAttribute("value");
		System.out.println("I have sent worng last name---"+lastworngname);
		Thread.sleep(1000);
		weblastusername.clear();
		
		//case 9. last name correct
		weblastusername.sendKeys("bind");
		String lastname=weblastusername.getAttribute("value");
		System.out.println("I have resent last name ---"+lastname);
	}

}

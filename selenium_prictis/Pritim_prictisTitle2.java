package selenium_prictis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pritim_prictisTitle2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();

		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		
	WebElement weusername=	driver.findElement(By.xpath("//input[@name='user_name']"));
	weusername.sendKeys("worng username");
	
	Thread.sleep(2000);
	weusername.clear();
	weusername.sendKeys("admin");
	
WebElement weuserpassword=	weusername .findElement(By.xpath("//input[@name='user_password']"));
	weuserpassword.sendKeys("admfguffr");
	Thread.sleep(2000);
	weuserpassword.clear();
	weuserpassword.sendKeys("admin");

WebElement weLoginbotton=	driver.findElement(By.xpath("//input[@id='submitButton']"));
	weLoginbotton.click();
	
String pageTitle=	driver.getTitle();
	System.out.println("page Title---"+pageTitle);
	
	if((pageTitle.contains(pageTitle)==true)) {
		
		System.out.println("user  pageTitle is  login vtiger---passed");
	}else{
		System.out.println("user  pageTitle is   not login vtiger---failed");
		
	}

     String sgetcurrenturl=	driver.getCurrentUrl();
	System.out.println("getCurrentUrl home page---"+sgetcurrenturl);
	
	if(sgetcurrenturl.contains(sgetcurrenturl)==true) {
		System.out.println("user getUrl login is vtiger---passed");
	}else{
		System.out.println("user getcurrentUrl login is not vtiger---passed");
		
		
	}
	}
	
	}

	


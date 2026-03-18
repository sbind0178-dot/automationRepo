package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtigertextcase2_facebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com");

		By userpassword=By.id("email");
		WebElement webpassword= driver.findElement(userpassword);
		webpassword.sendKeys("sunil@gmail.com");
		String typename=   webpassword.getAttribute("id");
		System.out.println("  user name--- "+typename);

		WebElement wepassword=driver.findElement(By.xpath("//input[@type='password']"));
		wepassword.sendKeys("995645495@@");
		String sname=wepassword.getAttribute("value");
		System.out.println("user password---"+sname);

		WebElement weblogin=    driver.findElement(By.xpath("//button[@name='login']"));
		String valuename= weblogin.getAttribute("name");
		System.out.println("login boutton---"+valuename);

		WebElement webcreataccount=  driver.findElement(By.xpath("//a[@href='/r.php?entry_point=login']"));
		String saccount=webcreataccount.getAttribute("role");
		webcreataccount.click();
		System.out.println("creat new account---"+saccount); 

		WebElement webfirstname= driver.findElement(By.xpath("//input[@name='firstname']"));
		webfirstname.sendKeys("manish dubey ");
		Thread.sleep(1000);
		webfirstname.clear();
		webfirstname.sendKeys("sunil");
		
		String afirstname= webfirstname.getAttribute("value");
		System.out.println("user the first name---"+afirstname); 

		WebElement weblastname=   driver.findElement(By.xpath("//input[@name='lastname']"));
		weblastname.sendKeys("bind");
		String alastname=weblastname.getAttribute("value");
		System.out.println("user tha last name---"+alastname);

		WebElement webday=	driver.findElement(By.xpath("//select[@aria-label='Day']"));
		webday.click();
		webday.sendKeys("24");
    	webday.click();
//		webday.clear();
//			webday.click();
//				webday.sendKeys("24");
//				webday.click();
//				Thread.sleep(1000);
//			
		String sday= webday.getAttribute("value");
		System.out.println("user of day---"+sday);

		WebElement webmonth= driver.findElement(By.xpath("//select[@name='birthday_month']"));
		webmonth.click(); 
		webmonth.sendKeys("august");
		webmonth.click();
		String smonth=webmonth.getAttribute("value");
		System.out.println("user of month---"+smonth);


		WebElement webuseryear= driver.findElement(By.xpath("//select[@id='year']"));
		webuseryear.click();
		webuseryear.sendKeys("2002");
		webuseryear.click();
		String syear=webuseryear.getAttribute("value");
		System.out.println("user by sent yaer---"+syear);

		WebElement webfemale= driver.findElement(By.xpath("//label[@class='_58mt']"));
		webfemale.click();
		String sfamale=webfemale.getAttribute("id");
		System.out.println("user is man ---"+sfamale);

		WebElement webusermoblienumber=  driver.findElement(By.xpath("//input[@name='reg_email__']"));
		webusermoblienumber.sendKeys("7062395415");
		String susermoblie=webusermoblienumber.getAttribute("value");
		System.out.println("user  sent  is mobile number---"+susermoblie);

		WebElement webnewpassword  =driver.findElement(By.xpath("//input[@type='password']"));
		webnewpassword.sendKeys("99563@##685");
		String snewpaword= webnewpassword.getAttribute("value");
		System.out.println("user sent is new password---"+snewpaword);

		WebElement websingup= driver.findElement(By.xpath("//button[@name='websubmit']"));
		websingup.click();
		String ssingup= websingup.getAttribute("name");
		System.out.println("user by the submit---"+ssingup);
		Thread.sleep(1000);
		driver.close();

	}

}

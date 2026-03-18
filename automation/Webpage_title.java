package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.BiDi;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage_title {

	public static void main(String[] args) throws InterruptedException {

		//	Topic 1.

		//		get_page_sorse();
		//		get_page_title();
		//		get_page_vtiger();


		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8888/");

		By username =By.xpath("//input [@name='user_name']");
		WebElement webusername =driver.findElement(username);
		webusername.sendKeys("admin");

		By byuserpassword=  By.xpath("//input [@name='user_password']");
		WebElement webpassword=   driver.findElement(byuserpassword);
		webpassword.sendKeys("adminer");
		Thread.sleep(1000);
		webpassword.clear();

		webpassword.sendKeys("admin");

		By  byloginboutton= By.xpath("//input[@id='submitButton']");
		WebElement webboutton=driver.findElement(byloginboutton);
		webboutton.click();

		By byleads=		By.xpath("//a[@href='index.php?module=Leads&action=index']");
		WebElement webleads= driver.findElement(byleads);
		webleads.click();

		By byaddclick= By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']");
		WebElement webaddclick=  driver.findElement(byaddclick);
		webaddclick.click();

		By bymrname= By.xpath("//select[@name='salutationtype']");
		WebElement webmrname=  driver.findElement(bymrname);
		webmrname.sendKeys("mr");

		By  byfirstname =By.xpath("//input[@name='firstname']");

// case 1.=gettitle method		
		String title= driver.getTitle();
		System.out.println("title vtiger"+title);

// case 2. sorcepage method	
//		String sorcepage=driver.getPageSource();
//		System.out.println("sorce page"+sorcepage);

// case 3. get vtiger methaod	
		Capabilities e=driver.getCapabilities();
		System.out.println(e);


		WebElement wefirstname1=driver.findElement(byfirstname);
		wefirstname1.sendKeys("mohan");
		Thread.sleep(1000);
		String valueclear=   wefirstname1.getAttribute("value");
		System.out.println("Inter the wrong first name ---"+valueclear);
		wefirstname1.clear();

		wefirstname1.sendKeys("sunil");
		String valuerightname=	wefirstname1.getAttribute("value");
		System.out.println("Inter the correct first name ---"+valuerightname); 







	}

}

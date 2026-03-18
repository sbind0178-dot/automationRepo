package automation;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_method {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();

		driver.get("http://localhost:8888/");  //Url hit


		By	byusername=	By.xpath("//input[@name='user_name']");
		WebElement weusername=driver.findElement(byusername);
		weusername.sendKeys("admin");
		
//  case 1.= get size user name is size
		
		org.openqa.selenium.Dimension dim=	weusername.getSize();
		int heigt=dim.height;
		int width=	dim.width;
		System.out.println(width);
		System.out.println(heigt); 



		By byuserpassword=	By.xpath("//input[@name='user_password']");
		WebElement webuserpassword=driver.findElement(byuserpassword);
		webuserpassword.sendKeys("admin");

		By byloginbutton=By.xpath("//input[@id='submitButton']");
		WebElement webbutton=driver.findElement(byloginbutton);
		webbutton.click();


		// case 1.=gettitle method	
		String title= driver.getTitle();
		System.out.println("title vtiger--"+title);

		// case 2. sorcepage method	
		//		String sorcepage=driver.getPageSource();
		//		System.out.println("sorce page--"+sorcepage);

		// case 3. get vtiger methaod		
		Capabilities e=driver.getCapabilities();
		System.out.println("get Capabilitie--"+e);

		// case 4. get vtiger methaod
		String currentname=driver.getCurrentUrl();
		System.out.println("get currentname--"+currentname);

		// case 5. get vtiger methaod
		String CurrentUrlname =  driver.getCurrentUrl();
		System.out.println(CurrentUrlname);



	}

}

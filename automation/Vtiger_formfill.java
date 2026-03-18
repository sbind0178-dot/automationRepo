package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger_formfill {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();


		driver.get("http://localhost:8888/");

		String	geturl=	driver.getCurrentUrl();
		System.out.println("url getting---"+geturl);

		String sgettitle=  driver.getTitle();
		System.out.println("get title---"+sgettitle);

		WebElement webusername= driver.findElement(By.xpath("//input[@name='user_name']"));
		webusername.sendKeys("aunil@123");
		Thread.sleep(1000);
		webusername.clear();
		webusername.sendKeys("admin");
		String svalue=webusername.getAttribute("value");
		System.out.println("user name is sent---"+svalue);

		WebElement webuserpassword= driver.findElement(By.xpath("//input[@name='user_password']"));
		webuserpassword.sendKeys("admivv");
		Thread.sleep(1000);
		webuserpassword.clear();
		webuserpassword.sendKeys("admin");
		String spasword=  webuserpassword.getAttribute("value");
		System.out.println("user password is sent---"+spasword);


		WebElement webloginboutton=  driver.findElement(By.xpath("//input[@type='submit']"));
		String slogin=webloginboutton.getAttribute("value");
		System.out.println("user the  click boutton---"+slogin);

		boolean boologin=webloginboutton.isDisplayed();
		System.out.println("is the login boutton Displayed---"+boologin);
/*
 *  // Checking login button is displayed or not. true/ false
 */
		boolean enabled=webloginboutton.isEnabled();
		System.out.println("is the login boutton enabled---"+enabled);

		String logintext=webloginboutton.getText();
		System.out.println("user the get login bouttob---"+logintext);
/*
 *   // it is will return  Dimension class of = object.
 */
		Dimension loginsize=webloginboutton.getSize();
		int getheight=   loginsize.getHeight();
		System.out.println("this is get Height---"+getheight);

		int getWidth=loginsize.getWidth();
		System.out.println("this is get width---"+getWidth);
/*
 *   //get Location will return point class = object
 */
		Point Alocation=webloginboutton.getLocation();
		int Xboutton= Alocation.getX();
		System.out.println("Login of X= boutton ---"+Xboutton);
	    int Ylocation=	Alocation.getY();
		System.out.println("Login of Y boutton---"+Ylocation);

		webloginboutton.click();

}
}
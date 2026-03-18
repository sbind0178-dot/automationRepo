package selenium_prictis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Linkpri {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver  driver =new ChromeDriver () ;
		driver.get("https://www.amazon.com/");
          driver.findElement(By.xpath("//button[@class='a-button-text']")).click();
          
		List <WebElement> wecheck =  driver.findElements(By.xpath("//button"));
		int totalcount=  wecheck.size();
		for(int i=0; i<totalcount; i++) {
			WebElement tagname= wecheck.get(i);
			String innertext=  tagname.getText();

		//	System.out.println(totalcount);
			System.out.println(innertext+"====");
			System.out.println(tagname);
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//img[@alt='Home Storage']"));
			 List<WebElement> wecheck2= driver.findElements(By.xpath("//a"));
			 int totalcount1=  wecheck.size();
				for(int j=0; j<totalcount; j++) {
					WebElement tagname1= wecheck.get(i);
					String innertext1=  tagname.getText();
//					System.out.println(totalcount);
					
					System.out.println(innertext+"====");
					System.out.println(tagname);
		}
	
   
	
	
	
	}
}}
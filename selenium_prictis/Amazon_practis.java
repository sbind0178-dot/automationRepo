package selenium_prictis;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_practis {

	public static void main(String[] args) {
		amazon1();
		amazon2();
	}	
		public static void amazon1() {
			
		ChromeDriver driver =new ChromeDriver();
	   
		driver.get("https://www.amazon.in");
		driver.findElement(By.linkText("Today's Deals")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		
	}
   public static void amazon2() {
	   
	   ChromeDriver driver =new ChromeDriver();
	   driver.get("https://www.amazon.in");
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("laptop");
	   driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();	   
	String firstProduct=driver.findElement(By.cssSelector("h2 a span")).getText();
	if(firstProduct.toLowerCase().contains("laptop")) {
		System.out.println("Laptop found product name");
	}else{
		System.out.println("Laptop not found");
	}
	   
   }
}

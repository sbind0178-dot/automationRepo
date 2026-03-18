package selenium_prictis;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class yatra_automatoin {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://yatra.com/");
		driver.findElement(By.xpath("//section[@class='style_box__dORVf']//img[@alt='cross']")).click();
		driver.findElement(By.xpath("//button[@id='simple-tab-1']//span[text()='Hotels']")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();

		String highprices=   driver.findElement(By.xpath("//h2[text()='The Zuri White Sands Goa Resort & Casino']/ancestor::div[@class='siteContainer']/ancestor::div//span[@class='HotelOverview_discountedPrice__ySGJ6']")).getText();
		String lowprices=   driver.findElement(By.xpath("//h2[text()='Sibaya Beach Resort']/ancestor::div[@class='siteContainer']/ancestor::div//span[@class='HotelOverview_discountedPrice__ySGJ6']")).getText();
		System.out.println(highprices);
		System.out.println(lowprices);



	}

}

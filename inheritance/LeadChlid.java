package inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadChlid extends ParentClass1 {
     
	public static void main (String []args) {
		ParentClass1 obj=new ParentClass1();
	
		obj.LauchBrouser();
		obj.driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']")).click();
		obj.driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		obj.driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sunil ");
		obj.driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("bind");
		obj.driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		
	}

}

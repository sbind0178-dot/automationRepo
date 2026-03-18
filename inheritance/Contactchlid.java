package inheritance;

import org.openqa.selenium.By;

public class Contactchlid extends ParentClass1{

	public static void main(String[]args) {
		
		Contactchlid  obj=new Contactchlid();
		obj.LauchBrouser();
		obj.driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index']")).click();
		obj.driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		obj.driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sunil");
		obj.driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("bind");
		obj.driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9956764686");
		obj.driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
		
	}

	}



package abstract_class2;

public class Running {

	public static void main(String[] args) {

		
		WebDriver driver =  new ChromBrowser();		 
		driver.openBrowser(); 
		driver.getUrl();
		driver.getText();
		driver.closeBrowser();
		  
		 
		 WebDriver driver1 =new FireFox();
		 driver1.openBrowser();
		 driver1.getUrl();
		 driver1.getText();
		 driver1.closeBrowser();
		 
		 WebDriver driver2=	 new SafariBrower();
		 driver2.openBrowser();
		 driver2.getUrl();
		 driver2.getText();
		 driver2.closeBrowser();
	     
	
	
	
	
	
	
	}

}

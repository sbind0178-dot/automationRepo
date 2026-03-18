package abstract_class2;

import org.openqa.selenium.WebElement;

public class ChromBrowser implements WebDriver{

	public void openBrowser() {
		System.out.println("Open Browser from ChromBrowser page");
	}
    public void geturl() {
    	System.out.println("Hit URLin ChromBrowser page");
   
    
    }
     
    public void getText() {
    	System.out.println("Return element inner text in ChromBrowser page");
    }
   public void closeBrowser() {
	   
	   System.out.println("close Browser from ChromBrowser page");

}

public void getUrl() {
	// TODO Au method stub
	
}
}

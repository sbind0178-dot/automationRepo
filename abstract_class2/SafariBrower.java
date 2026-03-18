package abstract_class2;

public class SafariBrower implements WebDriver {

	public void openBrowser() {

		System.out.println("Open Browser from safariBrowser page");
	}
	public void getURL() {
		System.out.println("Hit URL in SafariBrowser page");

     
	}
	public void getText() {
		System.out.println("Return element inner text in SafariBrowser page");
	}
	public void closeBrowser() {
		System.out.println("Close Browser from SafariBrowser page");
	}
	@Override
	public void getUrl() {
		// TODO Auto-generated method stub
		
	}
}

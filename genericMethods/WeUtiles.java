package genericMethods;



import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import groovyjarjarantlr4.v4.parse.ANTLRParser.exceptionGroup_return;

public class WeUtiles {

 public WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//WeUtiles wu=WeUtiles.class.newInstance();
                  
//	 
//		WeUtiles.get("http://localhost:8888/");
//		WeUtiles.webSendkey("//input[@name='user_name']", "admin");
//		WeUtiles.webSendkey("//input[@name='user_password']", "admin");
//		WeUtiles.click("//input[@id='submitButton']");
//		
//		WeUtiles.click("//a[@href='index.php?module=Leads&action=index']");
		//WeUtiles.validateTextEquals("//a[text()='Go to Advanced Search']", "go to Advanced Search");
	//	WeUtiles.validateTextContains("//a[text()='Go to Advanced Search']", "Advanced");

		


		// ===========================WebDriver===============================================

	}
	public  void LanchBrowser(  String browserName,String url) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			System.out.println("Chrome browser has been launch.");
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			System.out.println("Edge browser has been launch.");
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			System.out.println("Firefox browser has been launch.");
		}else {
			System.out.println("Browser name is wrong choose currect browserName.");
		}
	
		openURL(url);
		
		
	}
	
	
	public  void openURL(String url) {
		try {
			driver.get(url);
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	    //closes all opened browser.
		public  void handlequit() {
			driver.quit();
		}
		
		
		//close current open browser 
		public  void windowclose() {
			driver.close();
		}


	public   void click(WebElement element ) {
		
		try {
		 
		 element.click();		
		}
		catch(ElementClickInterceptedException e) {
			 JavascriptExecutor js=(JavascriptExecutor) driver;
			 js.executeScript("arguments[0].click();", element);
			 System.out.println("Click performed by javaScript Executor!!!");
		}
		catch(ElementNotInteractableException e) {
			 JavascriptExecutor js=(JavascriptExecutor) driver;
			 js.executeScript("arguments[0].click();", element);
			 System.out.println("Click performed by javaScript Executor!!!");
		}
	}
		

	public  String WebgetText( WebElement element) {
		String value=null;
		try {
			String text=element.getText();
			System.out.println("Inner Text "+text);
			return text;
		}
		catch(NoSuchElementException e) {  //X-path is wrong.
			WebDriverWait wait=	new WebDriverWait(driver, Duration.ofSeconds(60));
			 wait.until(ExpectedConditions.visibilityOfElementLocated((By) (element)));
		
			return value;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	/* isDisplayed form an element identified by xpath
	 * @param  xpath-xpath string to locate the element
	 * @return isDisplayed content of the element 
	 */ 
	public  boolean WebisDisplayed(WebElement Element ) {
		boolean display=true;
		try {
			
		boolean displayed=Element.isDisplayed();
		}catch(NoSuchElementException e) {
			System.out.println("it is NoSuchElement Exception");
			e.printStackTrace();
			throw e;

		}catch(Exception e) {
			System.out.println("it is Exception");
			e.printStackTrace();
			throw e;
		}
		return display;	
		
	}
	
	/* isEnabled form an element identified by xpath
	 *  @param  xpath-xpath string to locate the element
	 * @return  Enabled of the element
	 */
	public  boolean WebIsEnabled(WebElement element) {
		boolean Enabled=true;
		
		try {
			boolean Enabledboolean=  element.isEnabled();	
		}catch(NoSuchElementException e) {
			System.out.println("it is NoSuchElement Exception");
		}catch(NullPointerException e) {
			System.out.println("it is NullPointer Exception"); 

		}catch(Exception e) {
			System.out.println("it is  Exception ");
			e.printStackTrace();
			throw e;
		}

        return Enabled;
	}
	public  boolean WebIsSelected(WebElement element ) {
		boolean Selected=true;
		/*
		 *isSelected form an element identified by xpath
		 *  @param  xpath-xpath string to locate the element
		 * @return  Selected of the element 
		 */
		String WebElement ="";
		
		try {
			WebDriverWait wait=	new WebDriverWait(driver,Duration.ofSeconds(10));
			boolean  Selectedboolean=   element.isSelected();
			if(Selected==true) {
				System.out.println("Element is a select");
			}else{
				System.out.println("Element is a not select"); 
			}
		}catch(NoSuchElementException e) {
			System.out.println("it is NoSuchElement Exception");
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}    
		 return Selected;
	} 
	public void WebClear(WebElement element) {
		/*
		 *clear form an element identified by xpath
		 *@param  xpath-xpath string to locate the element
		 */
		try {

			element.clear();
		}catch(NoSuchElementException e) {
			System.out.println("it isNoSuchElement Exception ");

		}catch(NullPointerException e) {
			System.out.println("it is NullPointer Exception");

		}catch(Exception e) {
			System.out.println("it is Exception");
			e.printStackTrace();
			throw e;

		}

	}
public  String getTitle(WebElement element) {
	
		String TitleValue ="";
		try {
			TitleValue =driver.getTitle();
			 
		} catch(Exception e) {
			e.printStackTrace();
                throw e;
		}
	      return TitleValue;

   }


	public  String getAttribute(WebElement element ) {
		String attributeValue="";
	
		try {
			
			String Attribut=element.getAttribute("value");
			System.out.println(Attribut);
			
		} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		} catch(ElementNotInteractableException e) {
			e.printStackTrace();
			//return attributeValue;

		} catch(Exception e) {
			e.printStackTrace();
                throw e;
		}	
		return attributeValue;

	}
	/* getTag form an element identified by xpath
	 *  @param  xpath-xpath string to locate the element
	 * @return  ka HTML tag name  object of the element  
	 */
	public  String WebGetTagName(WebElement element) {
		String tagnamestring = null;
		try {
			tagnamestring=element.getTagName();
		//	return tagnamestring;

		}catch(NoSuchElementException e) {
			WebDriverWait wait=	new WebDriverWait(driver,Duration.ofSeconds(60));
			String text=element.getTagName();
			System.out.println("tag name "+text);
			//return text;
		}
		catch(NullPointerException e) {
			WebDriverWait wait=	new WebDriverWait(driver,Duration.ofSeconds(60));
			String text1=element.getTagName();
			//return text1;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
         return tagnamestring;
	}
	
	
	public  void  Sendkey(WebElement element,String Data ) {
		try {
			
			element.sendKeys(Data);
			
		}
		catch(NoSuchElementException e) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			element.sendKeys(Data);
			e.printStackTrace();
			
		}
		catch(NullPointerException e) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			element.sendKeys(Data);
			e.printStackTrace();
			


		}catch(Exception e) {

			WebDriverWait wait=	new WebDriverWait(driver,Duration.ofSeconds(10));
			element.sendKeys(Data);
			e.printStackTrace();
			

		}
	}

	//===========================Driver============================================
	public  void getUrl(WebElement element) {
		try {
			driver.getCurrentUrl();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			throw e;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public  String  getPageSource(WebElement element) {
		String getpage="";
		try {
		    getpage=	driver.getPageSource();
			System.out.println("page sourch"+getpage);	
		}
		catch(StaleElementReferenceException  e) {
		    getpage=driver.getPageSource();
			System.out.println("page sourch"+getpage);	
		}
		catch(Exception e) {
			e.printStackTrace();		 
		}
		return getpage;	 
	}
	
	public  void close(WebElement elemetn) {
		try {
			driver.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	} 
    //==============================NAVIGATION METHODS=========================================
	
	//navigateTo (HIT-URL)
	public  void navigateTo(String url) {
		try {
			driver.navigate().to(url);;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	//navigateBack
	public  void navigateBack( ) {
		try {
			driver.navigate().back();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	//navigateForward
	public  void navigateForward( ) {
		try {
			driver.navigate().forward();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	//navagateRafresh
	public  void navigateRefresh() {
		try {
			driver.navigate().refresh();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	//===========================Actions Class======================================  	   
    //double click
	public  void ActionsDoubleClick(String xpath) {
		WebElement element;
		try {
			  element=driver.findElement(By.xpath(xpath));
			Actions action= new Actions(driver);
			action.doubleClick(element).build().perform();
		}
		catch(NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
		catch(StaleElementReferenceException e) {	 
			element=driver.findElement(By.xpath(xpath));
			Actions action= new Actions(driver);
			action.doubleClick(element).build().perform();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	//Context-click=RightClick
	public  void ActionRightClick(String xpath) { 
		WebElement element;
		try {
			  element=driver.findElement(By.xpath(xpath));
			Actions action= new Actions(driver);
			action.contextClick(element).build().perform();
		}
		catch(NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
		catch(StaleElementReferenceException e) {	 
			element=driver.findElement(By.xpath(xpath));
			Actions action= new Actions(driver);
			action.contextClick(element).build().perform();
			System.out.println("Right click after staleElement.");
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	//mouse hover
	public  void ActionMouseHover(String xpath) {
		WebElement element;
		try {
			element=driver.findElement(By.xpath(xpath));		
			Actions action= new Actions(driver);		
			action.moveToElement(element).build().perform();
		}
		catch(NoSuchElementException e) {			
			e.printStackTrace();
			throw e;
		}
		catch(StaleElementReferenceException e) {	 
			element=driver.findElement(By.xpath(xpath));
			Actions action= new Actions(driver);
			action.moveToElement(element).build().perform();
			System.out.println("mouse hover staleElement.");
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	//drag and drop 
	public  void ActionDragAndDrop(String firstElement, String SecondElement) {
		WebElement element1;
		WebElement element2;
		try {
		    element1=driver.findElement(By.xpath(firstElement));	
			element2=driver.findElement(By.xpath(SecondElement));
			Actions action= new Actions(driver);		
			action.dragAndDrop(element1, element2).build().perform();
		}
		catch(StaleElementReferenceException e) {	 
			element1=driver.findElement(By.xpath(firstElement));	
			element2=driver.findElement(By.xpath(SecondElement));
			Actions action= new Actions(driver); 
			action.dragAndDrop(element1, element2).build().perform(); 		
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	 
	//Send-keys
	public  void ActionsSendkeys(String xpath, String value) {
		WebElement element;
		try {
		Actions action=new Actions(driver) ;
	    element=driver.findElement(By.xpath(xpath));
		action.moveToElement(element).sendKeys(xpath, value).build().perform(); 		
		}
		catch(StaleElementReferenceException e) {	 
			element=driver.findElement(By.xpath(xpath));	
 			Actions action= new Actions(driver); 
			action.moveToElement(element).sendKeys(xpath, value).build().perform(); 		
		}		
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	} 
	
	//scroll to element
	public  void ActionsScrollToElement(String xpath) {
		WebElement element;
		try {
		element=driver.findElement(By.xpath(xpath));
		Actions action=new Actions(driver) ;
		action.scrollToElement(element).build().perform();
	 }
	    catch(StaleElementReferenceException e){
	    	element=driver.findElement(By.xpath(xpath));
		Actions action=new Actions(driver) ;
		action.scrollToElement(element).build().perform();
	}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}		
	}

    //scroll by amount
	public  void ActionScrollByAmount(int x, int y) {
		try {
			Actions action=new Actions(driver) ;
		    action.scrollByAmount(x,y).build().perform();
	    }
		  catch(Exception e) {
		   e.printStackTrace();
		   throw e;
		}
	}

	//	=================================SelectClass========================================
	//Visible text se option select karta hai
	public  void selectByVisibleText(String xpath, String visibleText) {
		WebElement element;
		try {
			element= driver.findElement(By.xpath(xpath));
		      Select slt=new Select(element);
		      slt.selectByVisibleText(visibleText);
		}
		  catch(NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
		   catch(StaleElementReferenceException e) {
			    element= driver.findElement(By.xpath(xpath));
				Select slt=new Select(element);
				slt.selectByVisibleText(visibleText);
				e.printStackTrace();
				throw e;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	// attribute se select karta hai.
	public  void selectByValue(String xpath, String atrributeName) {
		WebElement element;
		try {
			element= driver.findElement(By.xpath(xpath));
		      Select slt=new Select(element);
		      slt.selectByValue(atrributeName);
		}
		  catch(NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
		   catch(StaleElementReferenceException e) {
			    element= driver.findElement(By.xpath(xpath));
				Select slt=new Select(element);
				slt.selectByValue(atrributeName);
				e.printStackTrace();
				throw e;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	//index Number se select karta hai (0 se start)
	public  void selectByIndex(String xpath, int index) {
		WebElement element;
		try {
			element= driver.findElement(By.xpath(xpath));
		      Select slt=new Select(element);
		      slt.selectByIndex(index);
		}
		  catch(NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
		   catch(StaleElementReferenceException e) {
			    element= driver.findElement(By.xpath(xpath));
				Select slt=new Select(element);
				slt.selectByIndex(index);
				e.printStackTrace();
				throw e;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	// Multi-select dropdown me deselcectkarta hai
	public  void selecetDeselectByVisibleText(String xpath, String value) {
		WebElement webdeselectbyVis=driver.findElement(By.xpath(xpath));
		Select slt=new Select(webdeselectbyVis);
		slt.deselectByVisibleText(value);

	}

	public  void SelectDeselectByvalue(String xpath, String  value) {
		WebElement webdeselecvalue= driver.findElement(By.xpath(xpath));
		Select slt=new Select(webdeselecvalue);
		slt.deselectByValue(value);
	}  
	public  void SelectDeselectByIndex(String xpath, int  index) {
		WebElement deselectindex=   driver.findElement(By.xpath(xpath));
		Select slt=new Select(deselectindex);
		slt.deselectByIndex(index);

	}
	// sabhi selected options remove karta hai (multi-select me kaam karega)
	public  void DeSelectAll( String xpath) {
		WebElement webdeselectAll=driver.findElement(By.xpath(xpath));
		Select slt=new Select(webdeselectAll);

	}
	
	
	// Dropdown ke saare options return karta hai.
	public  void SelectgetOptions(String xpath ) {
		WebElement element;	 
		try {
			element=  driver.findElement(By.xpath(xpath));
		    Select slt=new Select(element);
		    List<WebElement> Options=slt.getOptions();
		    for(WebElement  dropDowntext :Options) {
		    	System.out.println(dropDowntext);
		    }
	    } 
		catch(StaleElementReferenceException e) {
			element=  driver.findElement(By.xpath(xpath));
		    Select slt=new Select(element);
		    List<WebElement> Options=slt.getOptions();
		    for(WebElement  dropDowntext :Options) {
		    	System.out.println(dropDowntext);
		    }
	 }
	    catch(Exception e) {
			e.printStackTrace();
			throw e;	 
	  }
		
	  }

	//jo option selected hai wo return karta hai.
	public  void getFirstSelectedOption(String xpath) {
		WebElement element;
		try {
		   element=driver.findElement(By.xpath(xpath));
		   Select slt=new Select(element);
		   slt.getFirstSelectedOption();
	}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}	
	}

	// Multi-select me sab selected options return karta hai.
	public  void SelectgetAllSelectedOption( String value) {
		WebElement webgetAllSe= driver.findElement(By.xpath(value));
		Select slt=new Select(webgetAllSe);
		slt.getAllSelectedOptions();

	}
	// ==============================JavaScriptExecutor============================
	// Click using javaScript
	public  void JavaScrexecutorclick( String script) {
		JavascriptExecutor jsc= (JavascriptExecutor)driver;
		jsc.executeScript("argument[0].click();");
	}
	
	//Send value using javaScript
	public  void JsSendkeys( String script) {
		JavascriptExecutor jsc= (JavascriptExecutor)driver;
		jsc.executeScript("argument[0].value='sunil'");
	}
	
	//ScrollDown to window down 
	public  void JavaScrjavaScrollDown( String script) {
		JavascriptExecutor jsc= (JavascriptExecutor)driver;
		jsc.executeScript("window.scrollBy(0,500)");
	}
	public  void javaScrGetTitle( String script) {
		JavascriptExecutor jsc= (JavascriptExecutor)driver;
		jsc.executeScript("returndocument.title;").toString();


	}
	//==========================WindowHandle=====================			

	// Current window ka handle unique ID (handle) return karat hai.

	public  String getWindowHandle(String actTitle,String expTitle) {
		String windo=driver.getWindowHandle();
		return windo;
	}
	
	//All open windows tabs/ka handle return done hai.(Set)
	public  void windowHandleByUrl(String actTitle, String url) {
		try {
		Set<String> allHandleValue = driver.getWindowHandles(); 
		for(String handlevalue : allHandleValue){ 
			driver.switchTo().window(handlevalue);
			String currenturl=driver.getCurrentUrl();
			if(url.contains("")) {
				System.out.println("found");
			}
			System.out.println(handlevalue);
		} 	
	}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	// Specific window par switch karta hai
	public  void switchTos(String value) {
		try {
			driver.switchTo().window(value);
			System.out.println("");
		}catch(Exception e){
			System.out.println("Exception "+e.getMessage());
		}

	}

	public  void acceptAlert() {
		driver.switchTo().alert().accept();;
	}
	public  void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	
	
	//==========================Validation Methods===========================================
	//Text
	public  void validateTextEquals(WebElement element, String expectedText) {
		String actualText=WebgetText(element);
		String errorMsg="-Expected :"+expectedText+"-Actual :"+actualText;
		if(!actualText.equals(expectedText)) {
			System.out.println("VALIDATION FAILED :"+errorMsg);
			throw new AssertionError(errorMsg);
		}
		System.out.println("VALIDATION PASSED : "+errorMsg);
	}
	
	public  void validateTextEqualIgnoreCase(WebElement element, String expectedText) {
		String actualText=WebgetText(element);
		String errorMsg="Expected :"+expectedText+"Actual :"+actualText;	
		if(!actualText.equalsIgnoreCase(expectedText)) {
			System.out.println("VALIDATION FAILED :"+errorMsg);
			throw new AssertionError(errorMsg);
		}
		System.out.println("VALIDATION PASSED : "+errorMsg);
	 
	}
	
	public  void validateTextContains(WebElement element, String expectedText) {
		String actualText=WebgetText(element);
		String errorMsg="-Expected :"+expectedText+"-Actual :"+actualText;
		if(!actualText.contains(expectedText)) {	 
			System.out.println("VALIDATION FAILED :"+errorMsg);
			throw new AssertionError(errorMsg);
	}
		System.out.println("VALIDATION PASSED : "+errorMsg);
	
	
	}
	   //AttributeValue
        public  void  validateAttributeContains(WebElement element,String expectedAttribute) {
       	String  actualAttribute=getAttribute(element);
          String errorMsg="Expected :"  +expectedAttribute+"Actual :"+ actualAttribute;	
        	if(!actualAttribute.contains(expectedAttribute)) {
        		System.out.println("VALIDATION FAILED :"+errorMsg);
        		throw new AssertionError(errorMsg);
     
        }
    		System.out.println("VALIDATION PASSED : "+errorMsg);

		}
      
		 public  void ValidateAttributeEquals(WebElement element,String expetedAttribute) {
		String	actualAttribute= getAttribute(element);
		String errorMag="Expected :"+expetedAttribute+"Actual :"+actualAttribute;
		if(! actualAttribute.equals(actualAttribute)) {
			System.out.println("VALIDATION FAILED :"+errorMag);
			throw new AssertionError(errorMag);
		}
				System.out.println("VALIDATION PASSED :"+errorMag);
		}
		 public  void validateAttributeEqualIgnorcase(WebElement element,String expetedAttribute) { //EqualIgnoreCase
		String	 actualAttribute=getAttribute(element);
		String errorMag="Expected :"+expetedAttribute+"Actual :"+actualAttribute;
		if(! actualAttribute.equalsIgnoreCase(expetedAttribute)) {
		System.out.println("VALIDATION FAILED "+errorMag);
		throw new AssertionError(errorMag);
		}
		System.out.println("VALIDATION PASSED :"+errorMag); 
     }
		 //Title
	 public   void ValidateTitleEquals( WebElement element,String expetedTitle) {
	     String actualTitle=getTitle(element);
	     String message="Expected title "+expetedTitle+"Actual title "+actualTitle;
	     
	     if(! actualTitle.equals(expetedTitle)) {
	    	 System.out.println("VALIDATION FAILED - "+message);
	    	 throw new AssertionError(message);
	     } 
			System.out.println("VALIDATION PASSED - "+message);
		}
	 
            public  void ValidateTitleEqualEgnorCase(WebElement element) {
              String actualTitle=getTitle(element); 
           
           if(actualTitle.equalsIgnoreCase(actualTitle)==true) {
        	   System.out.println("Validation failed");
            
           }else{
        	   System.out.println("Validation passed");
               throw new AssertionError(actualTitle);
           }
           
            }
            
            public  void ValidateTitleContains(WebElement element) {
			String actualTitle=	getTitle(element);
			
			if(actualTitle.contains(actualTitle)) {
				System.out.println("Validation Failed");
			}else{
				System.out.println("Validation passed");
			
			throw new AssertionError(actualTitle);
			}
			
            }
           
            }
          

            
      

						
				
 
		

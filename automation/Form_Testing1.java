package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Form_Testing1 {


	public static void main(String[]args)  {

		ChromeDriver driver =new ChromeDriver();
		driver.get("http://localhost:8888/");

		String expected ="vtiger CRM 5 - Commercial Open Source CRM";
		String atcualtitle= driver.getTitle();
		System.out.println("user is gettitle----"+atcualtitle);
		if(expected.equalsIgnoreCase(atcualtitle)) {
			System.out.println( "title and expectedtitle are method ---Title validation passed" );

		}else{
			System.out.println("atcualtitle and expectedtitle are method ---Title validation failed");
		}

		//////////////////////////////////////username////////////////////////////

		WebElement webusername=	driver.findElement(By.xpath("//input[@name='user_name']"));

		//	boolean expectedusername=webusername.isDisplayed();
		//	webusername.isDisplayed();
		//	if(expectedusername){
		if(webusername.isDisplayed()==true) {
			System.out.println("UserName TextBox is Display---- Validation Passed");
		}else{		
			System.out.println("UserName TextBox is Not Display-----Validation failed");
		}     

		if(webusername.isEnabled()) {
			System.out.println("UserName TextBox is Enable --- Validation Passed ");
		}else{
			System.out.println("UserName TextBox is not Enable --- Validation Failed ");

			//blank text box
		}
		//		String BlankUser=webusername.getAttribute("value"); 

		String expectedatributevalue="value";
		//	String actualattributevalue="";	

		if(expectedatributevalue.equals("actualattributevalue")) {

			System.out.println("UserName TextBox is Blank ---- Validation Passed");
		}else{
			System.out.println("UserName TextBox is Not Blank---- Validation failed");	


			// user name box size     

			Dimension usernameboxsize= webusername.getSize();
			//user name box Height  
			int actualusernameheight=usernameboxsize.getHeight();
			int expectedusernameboxheight=30;
			if(actualusernameheight==expectedusernameboxheight) {
				System.out.println("height is----passed   ");
			}else{
				System.out.println("height is not----feiled  ");
			}
			// user name box Width
			int actualusernameWidth=usernameboxsize.getWidth();
			int expectedusernameboxEidth=120;
			if(actualusernameWidth==expectedusernameboxEidth) {
				System.out.println("Width is ----passed  ");
			}else{
				System.out.println("Width is not ----feiled  ");
			}

		}
		webusername.sendKeys("admin");

		//////////////////////////////////////////	password//////////////////////////////////////////////////////////

		WebElement webuserpassword=	driver.findElement(By.xpath("//input[@name='user_password']"));

		if(webuserpassword.isDisplayed()==true) {
			System.out.println(" user password is Display visible---- passed");
		}else{
			System.out.println(" user password is not Display visible---- failed");
		}
		if(webuserpassword.isEnabled()==true) {
			System.out.println("user password textbox enabled is visible---- passed");
		}else{
			System.out.println("user password textbox enabled is not visible----failed");
		}		

		String expectedatribute="password";

		// using is blank text box	

		String	actualattribute=webuserpassword.getAttribute("type");
		if(expectedatribute.equals(actualattribute)==true) {	 
			System.out.println("user TextBox password is blank--- passed");
		}else{
			System.out.println("user TextBox password is not Blank--- failed");

		}
		webuserpassword.sendKeys("admin");

		///////////////////////////////////////////login button////////////////////////////////////////////////////////////

		WebElement weLogin= driver.findElement(By.xpath("//input[@id='submitButton']"));

		if(weLogin.isDisplayed()==true) {
			System.out.println("user Login button Display is visible....passed");

		}else{
			System.out.println("user Login button Display is not visible....failed");
		}
		if(weLogin.isEnabled()==true) {
			System.out.println("user Enable Login button is visible....passed");
		}else{
			System.out.println("user Enable Login button is not .....failed");


		}
		weLogin.click();
		String expectedtitlehomepage= "  Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM       " ;
		String atcualtitlehomepage=driver.getTitle();
		System.out.println("atcualtitleleads leads ----"+atcualtitlehomepage);

		if(expectedtitlehomepage.equals(atcualtitlehomepage)==true) {
			System.out.println("title and is expectedtitle Homepage-----Title validation passed");
		}else{
			System.out.println("title   is not expectedtitle Homepage-----Title validation failed");

		}
		//	weLogin.click();

		////////////////////////////////////////////////////Leads click////////////////////////////////////////////////////	
		WebElement webleads=    driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));

		if(webleads.isDisplayed()==true) {
			System.out.println("user Leads click Display is visible....passed");
		}else{
			System.out.println("user Leads click Display is not visible....failed");

		}
		if(webleads.isEnabled()==true) {
			System.out.println("user Enable Leads button is visible....passed");
		}else{
			System.out.println("user Enable Leads button is not visible....failed");
		}
		webleads.click();

		WebElement webplus=	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));

		if(webplus.isDisplayed()==true) {
			System.out.println("user plus click Display is visible....passed");
		}else{
			System.out.println("user plus click Display is not visible....failed");

		}
		if(webplus.isEnabled()==true) {

			System.out.println("user plus click Enable is visible....passed");
		}else{

			System.out.println("user plus click Enable is not visible....failed");
		}
		webplus.click();

		//////////////////////////////////////Form_fillup///////////////////////////////////////////////

		WebElement webmr=  driver.findElement(By.xpath("//select[@name='salutationtype']"));

		///Mr.//////  
		if(webmr.isDisplayed()==true) {
			System.out.println("user Mr. input Box Display is visible....passed");
		}else{
			System.out.println("user Mr. input Box Display is not visible....failed");
		}
		if(webmr.isEnabled()==true) {
			System.out.println("user mr. input Box Enable is visible....passed");
		}else{
			System.out.println("user Mr. input Box Enable is not visible....failed");
		}
		webmr.sendKeys("mr.");
		webmr.click();
		webmr.click();
		WebElement webFristName=driver.findElement(By.xpath("//input[@name='firstname']"));

		if(webFristName.isDisplayed()==true) {
			System.out.println("user FristName input Box Display is visible....passed");
		}else{
			System.out.println("user FristName input Box Display is  not visible....failed");
		}
		if(webFristName.isEnabled()==true) {
			System.out.println("user FristName input Box Enable is  visible....passed");
		}else{

			System.out.println("user FristName input Box Enable is not visible....failed");
		}
		//       if(webFristName.isSelected()==true) {
		//    	   System.out.println("user FristName textBox Selected is visible....passed");
		//       }else{
		//    	   System.out.println("user FristName textBox Selected is not visible....failed");
		//       }
		webFristName.sendKeys("snuil");

		WebElement weLastname=  driver.findElement(By.xpath("//input[@name='lastname']"));

		if(weLastname.isDisplayed()==true) { 
			System.out.println("user LastName input Box Display is visible....passed"); 
		}else{
			System.err.println("user LastName  input Box Display is not visible....failed");
		}
		if(weLastname.isEnabled()==true) {
			System.out.println("user LastName input Box Enable is visible....passed");
		}else{
			System.out.println("user LastName input Box Enable is not visible....failed");
		}

		weLastname.sendKeys("bind");

		// ////////  Company text box

		WebElement webnamecompany = driver.findElement(By.xpath("//input[@name='company']"));

		if(webnamecompany.isDisplayed()==true) {
			System.out.println("user companyname input Box Display is visible....passed");
		}else{
			System.out.println("user companyname input Box Display is not visible....failed");

		}
		if(webnamecompany.isEnabled()==true) {
			System.out.println("user companyname input Box Enable is visible....passed");
		}else{
			System.out.println("user companyname input Box Enable is not visible....failed");
		}
		/// blank is company

		String actualattributecompany="type";
		String expectedatributecompany="";
		//  webnamecompany.getAccessibleName("value");
		if(actualattributecompany.equals(expectedatributecompany)==true) {

			System.out.println("User companyname input Box is Blank ---- Validation Passed");
		}else{
			System.out.println("User companyname input Box is not Blank ---- Validation failed");
		}
		webnamecompany.sendKeys("amazon");

		////////////////Title Text box

		WebElement webtitle= driver.findElement(By.xpath("//input[@id='designation']"));
		if(webtitle.isDisplayed()==true) {

			System.out.println("user Title input Box Display is  visible....Passed");
		}else{
			System.out.println("user Title input Box Display is not visible....failed");

		}
		if(webtitle.isEnabled()==true) {
			System.out.println("user Title input Box Enable is  visible....Passed");
		}else{
			System.out.println("user Title input Box Enable is not visible....failed");
		}

		//// Title blank

		String blanktitle= webtitle.getAttribute("value");

		if(blanktitle.equals(blanktitle)) {
			System.out.println("user title input Box is Blank ---- Validation Passed");
		}else{
			System.out.println("user title input Box is  not Blank ---- Validation failed");

		}
		webtitle.sendKeys("UP 66");

		/////.///////////////////////  input box Lead Source//////////////////////////////////////////

		WebElement webLeadSource  =  driver.findElement(By.xpath("//select[@name='leadsource']"));
		if(webLeadSource.isDisplayed()==true) {

			System.out.println("user Lead Source input Box Display is  visible....Passed");
		}else{
			System.out.println("user Lead Source input Box Display is  not visible....failed");
		}
		if(webLeadSource.isEnabled()==true) {

			System.out.println("user Lead Source input Box Enable is  visible....Passed");
		}else{
			System.out.println("user Lead Source input Box Enable is not visible....failed");
		}
		String blankLeads_Source= webLeadSource.getAttribute("value");
		if(blankLeads_Source.equals(blankLeads_Source)==true) {

			System.out.println("user Leads_Source input Box is  Blank ---- Validation Passed");
		}else{

			System.out.println("user Leads_Source input Box is  not Blank ---- Validation failed");
		}
		webLeadSource.sendKeys("cold call");
		webLeadSource.click();
		webLeadSource.click();
		/////////////////////////////////////////Industry///////////////////////////////////////

		WebElement webIndustry	=  driver.findElement(By.xpath("//select[@name='industry']"));

		if(webIndustry.isDisplayed()==true) {
			System.out.println("user Industry input Box Display is  visible....Passed");
		}else{
			System.out.println("user Industry input Box Display is not visible....failed");
		}
		if(webIndustry.isEnabled()==true) {

			System.out.println("user Industry input Box Enable is  visible....Passed");
		}else{
			System.out.println("user Industry input Box Enable is not visible....failed");
		}

		/////  blank text box Industry
		///       
		String blank_Industry=    webIndustry.getAttribute("value");

		if(blank_Industry.equals(blank_Industry)==true) {
			System.out.println("user Industry input Box is  Blank ---- Validation Passed");
		}else{
			System.out.println("user Industry input Box is  not Blank ---- Validation failed");
		}
		webIndustry.sendKeys("Banking");
		webIndustry.click();
		webIndustry.click();

		//////////////////////////////////////////////Annual_Revenue///////////////////////////////////////


		WebElement webAnnual_Revenue = driver.findElement(By.xpath("//input[@name='annualrevenue']"));

		if(webAnnual_Revenue.isDisplayed()==true) {
			System.out.println("user Annual_Revenue input Box Display is  visible....Passed");
		}else{
			System.out.println("user Annual_Revenue input Box Display is  not visible....failed");
		}
		if(webAnnual_Revenue.isEnabled()==true) {

			System.out.println("user Annual_Revenue input Box Enable is  visible....Passed");
		}else{
			System.out.println("user Annual_Revenue input Box Enable is not  visible....failed");
		}
		String AnnualRevenue = webAnnual_Revenue.getAttribute("value");

		//////  AnnualRevenue blank text box 
		///
		if(AnnualRevenue.equals(AnnualRevenue)==true) {

			System.out.println("user Annual_Revenue input Box is Blank ---- Validation Passed");
		}else{
			System.out.println("user Annual_Revenue input Box is  not Blank ---- Validation failed");
		}
		webAnnual_Revenue.sendKeys("20000");

		/////////////////////////////////////////////No_Employees//////////////////////////////////////////  
		///
		///
		WebElement webNo_Employees	=   driver.findElement(By.xpath("//input[@id='noofemployees']"));

		if(webNo_Employees.isDisplayed()==true) {
			System.out.println("user No_Employees input Box Display is  visible....Passed");
		}else{
			System.out.println("user No_Employees input Box Display is not  visible....failed");
		}
		if(webNo_Employees.isEnabled()==true) {
			System.out.println("user No_Employees input Box Enable is   visible....Passed");
		}else{
			System.out.println("user No_Employees input Box Enable is not  visible....failed");
		}
		/////   webNo_Employees blank text box

		String No_Employees= webNo_Employees.getAttribute("value");

		if(No_Employees.equals(No_Employees)==true) {
			System.out.println("user No_Employees input Box is  Blank ---- Validation Passed");
		}else{
			System.out.println("user No_Employees input Box is  not Blank ---- Validation failed");
		}
		webNo_Employees.sendKeys("89");

		////////////////////////////////////////Secondary_Emai//////////////////////////////////////////

		WebElement webSecondary_Email= driver.findElement(By.xpath("//input[@id='secondaryemail']"));

		if(webSecondary_Email.isDisplayed()==true) {

			System.out.println("user Secondary_Email input Box Display is visible....Passed");
		}else{
			System.out.println("user Secondary_Email input Box Display is not  visible....failed");
		}
		if(webSecondary_Email.isEnabled()==true) {

			System.out.println("user Secondary_Email input Box Enable is  visible....Passed");
		}else{
			System.out.println("user Secondary_Email input Box Enable is not  visible....failed");
		}
		////// Secondary_Email blank text box
		///
		String Secondary_Emailattribute= webSecondary_Email.getAttribute("value");

		if(Secondary_Emailattribute.equals(Secondary_Emailattribute)==true) {
			System.out.println("user Secondary_Email input Box is   Blank ---- Validation Passed");
		}else{
			System.out.println("user Secondary_Email input Box is  not Blank ---- Validation failed");
		}
		webSecondary_Email.sendKeys("sbind1043@gmail.com");

		//////////////////////////////////////////phone///////////////////////////////////////////

		WebElement webphone =   driver.findElement(By.xpath("//input[@id='phone']"));

		if(webphone.isDisplayed()==true) {

			System.out.println("user phone input Box Display is visible....Passed");
		}else{
			System.out.println("user phone input Box Display is  not visible....failed");
		}
		if(webphone.isEnabled()==true) {

			System.out.println("user phone input Box Enable is  visible....Passed");
		}else{
			System.out.println("user phone input Box Enable is not  visible....failed");

			//////phone blank text box
		}
		String phoneattribute= webphone.getAttribute("value");
		if(phoneattribute.equals(phoneattribute)==true) {

			System.out.println("user phone input Box is Blank ---- Validation Passed");
		}else{
			System.out.println("user phone input Box is  not Blank ---- Validation failed");
		}
		webphone.sendKeys("0999-394-3943");

		////////////////////////////////////////////////mobile////////////////////////////////////////////
		///  
		WebElement webmobile=   driver.findElement(By.xpath("//input[@id='mobile']"));

		if(webmobile.isDisplayed()==true) {
			System.out.println("user mobile input Box Display is visible....Passed");
		}else{
			System.out.println("user mobile input Box Display is  not visible....failed");
		}
		if(webmobile.isEnabled()==true) {

			System.out.println("user mobile input Box Enable is visible....Passed");
		}else{
			System.out.println("user mobile input Box Enable is not  visible....failed");

		}
		/////mobile blank text box
		///
		String mobileattribute=   webmobile.getAttribute("value");

		if(mobileattribute.equals(mobileattribute)==true) {
			System.out.println("user mobile input Box is Blank ---- Validation Passed");
		}else{
			System.out.println("user mobile input Box is  not Blank ---- Validation failed");
		}
		webmobile.sendKeys("996754942");

		WebElement webfax=	driver.findElement(By.xpath("//input[@id='fax']"));

		if(webfax.isDisplayed()==true) {
			System.out.println("user fax input Box Display is visible....Passed");
		}else{
			System.out.println("user fax input Box Display is  not visible....failed");

		}
		if(webfax.isEnabled()==true) {
			System.out.println("user fax input Box Enable is visible....Passed");
		}else{
			System.out.println("user fax input Box Enable is not  visible....failed");
		}

		/////fax blank text box

		String faxattribute=	webfax.getAttribute("value");

		if(faxattribute.equals(faxattribute)==true) {

			System.out.println("user fax input Box is Blank ---- Validation Passed");
		}else{
			System.out.println("user fax input Box is  not Blank ---- Validation failed");

		}
		webfax.sendKeys("23");

		////////////////////////////////////////Email//////////////////////////////////////////////
		///
		///
		WebElement webEmail=  driver.findElement(By.xpath("//input[@id='email']"));
		if(webEmail.isDisplayed()==true) {
			System.out.println("user Email input Box Display is visible....Passed");

		}else{
			System.out.println("user Email input Box Display is  not visible....failed");

		}
		if(webEmail.isEnabled()==true) {

			System.out.println("user Email input Box Enable is visible....Passed");
		}else{
			System.out.println("user Email input Box Enable is not  visible....failed");
		}

		/////Email blank text box
		String sattribute_Email= webEmail.getAttribute("value");


		if(sattribute_Email.equals(sattribute_Email)==true) {

			System.out.println("user Email input Box is  Blank ---- Validation Passed");
		}else{
			System.out.println("user Email input Box is  not Blank ---- Validation failed");

		}

		webEmail.sendKeys("sbind1034@gmail.com");

		/////////////////////////////////////////////////Website///////////////////////////////////////////

		WebElement webWebsite= 	driver.findElement(By.xpath("//input[@style='width:74%;']"));

		if(webWebsite.isDisplayed()==true) {
			System.out.println("user Website input Box Display is visible....Passed");
		}else{
			System.out.println("user Website input Box Display is  not visible....failed");
		}
		if(webWebsite.isEnabled()==true) {
			System.out.println("user Website input Box Enable is visible....Passed");
		}else{
			System.out.println("user Website input Box Enable is not  visible....failed");
		}
		/////Website blank text box

		String sattriWebsite=webWebsite.getAttribute("value");
		
		////////////////////////////////////LeadStatus//////////////////////////////////////////////////
      
		if(sattriWebsite.equals(sattriWebsite)==true) {
			
			System.out.println("user Website input Box is Blank ---- Validation Passed");
		}else{
			System.out.println("user Website input Box is  not Blank ---- Validation failed");
		}

	    webWebsite.sendKeys("www.amazon.com");
	    
	WebElement weLead_Status= driver.findElement(By.xpath("//select[@name='leadstatus']"));
	    if(weLead_Status.isDisplayed()==true) {
	    	
	    	System.out.println("user LeadStatus input Box Display is visible....Passed");
	    }else{
	    	System.out.println("user LeadStatus input Box Display is  not visible....failed");
	    }
	    if(weLead_Status.isEnabled()==true) {
	    	System.out.println("user LeadStatus input Box Enable is visible....passed");
	    }else{
	    	System.out.println("user LeadStatus input Box Enable is not  visible....failed");
	    
	    }
	
	    /////LeadStatus blank text box
	   
	String sStstus=    weLead_Status.getAttribute("value");
	    
	    if(sStstus.equals(sStstus)==true) {
	    	System.out.println("user LeadStatus input Box is Blank ---- Validation passed");
	    }else{
	    	System.out.println("user LeadStatus input Box is  not Blank ---- Validation failed");
	    }
	    weLead_Status.click();
	    weLead_Status.sendKeys("cold");
	    weLead_Status.click();
		}

	}






























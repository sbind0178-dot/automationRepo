package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger_xpath2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		/*
		 *   // tagname[text()='innertextvalue'] ///  ----.1 simple xpath
		 *    //tagname[@attributename='attribute_value'] // ----.2 simple xpath 
		 */

		By	byusername=	By.xpath("//input[@name='user_name']");
		WebElement weusername=driver.findElement(byusername);
		weusername.sendKeys("admin");

		By byuserpassword=	By.xpath("//input[@name='user_password']");
		WebElement webuserpassword=driver.findElement(byuserpassword);
		webuserpassword.sendKeys("admin");

		By byloginbutton=By.xpath("//input[@id='submitButton']");
		WebElement webbutton=driver.findElement(byloginbutton);
		webbutton.click();

		//		By byCalendarlogin=By.xpath("//a[@href='index.php?module=Calendar&action=index']");
		//		WebElement  webCalenderbutton=driver.findElement(byCalendarlogin);
		//		webCalenderbutton.click();
		//
		//		By  byLeadslogin=By.xpath("//a[@href='index.php?module=Leads&action=index']");
		//		WebElement webLeadsbutton=driver.findElement(byLeadslogin);
		//		webLeadsbutton.click();
		//
		//		By byOrganizationslogin= By.xpath("//a[@href='index.php?module=Accounts&action=index']");
		//		WebElement webOrganizationuserpage=driver.findElement(byOrganizationslogin);
		//		webOrganizationuserpage.click();
		//
		//		By	byContactbutton=    By.xpath("//a[@href='index.php?module=Contacts&action=index']");
		//		WebElement webcontactsuserpage=driver.findElement(byContactbutton);
		//		webcontactsuserpage.click();
		//
		//		By  byOpportunitieslogin=  By.xpath("//a[@href='index.php?module=Potentials&action=index']");
		//		WebElement webOpportunitiespage=driver.findElement(byOpportunitieslogin);
		//		webOpportunitiespage.click();
		//
		//		By  byProductslogin=   By.xpath("//a[@href='index.php?module=Products&action=index']");=
		//		WebElement webProductspage=driver.findElement(byProductslogin);
		//		webProductspage.click();
		//
		//		By	byDocumentslogin=	By.xpath("//a[@href='index.php?module=Documents&action=index']");
		//		WebElement webDocumentspage=driver.findElement(byDocumentslogin);
		//		webDocumentspage.click();
		//
		//
		//		By	byEmailslogin= By.xpath("//a[@href='index.php?module=Emails&action=index']");
		//		WebElement webEmailspage=driver.findElement(byEmailslogin);
		//		webEmailspage.click();
		//
		//		By	byTrouble_tickts=By.xpath("//a[@href='index.php?module=HelpDesk&action=index']");
		//		WebElement webTrouble_ticktspage=driver.findElement(byTrouble_tickts);
		//		webTrouble_ticktspage.click();
		//
		//		By	byDashboardlogin=By.xpath("//a[@href='index.php?module=Dashboard&action=index']");
		//		WebElement webDashboardpage=driver.findElement(byDashboardlogin);
		//		webDashboardpage.click();
		//
		//		By bymorelogin=	By.xpath("//a[@href='javascript:;']");
		//		WebElement webmorepage=driver.findElement(bymorelogin);	
		//		webmorepage.click();
		//
		By byLeadslogin2=By.xpath("//a[@href='index.php?module=Leads&action=index']");
		WebElement webLeadsbutton2=driver.findElement(byLeadslogin2);
		webLeadsbutton2.click();
		Thread.sleep(3000);
		By addlogin= By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']");
		WebElement webaddpage=driver.findElement(addlogin);
		webaddpage.click();

		By   byLeadsusername=    By.xpath("//select[@name='salutationtype']");
		WebElement webleadsusername=driver.findElement(byLeadsusername);
		webleadsusername.sendKeys("Mr.");
		Thread.sleep(1000);

		By  byusername1=  By.xpath("//input[@name='firstname']");
		WebElement webusername1=driver.findElement(byusername1);
		webusername1.sendKeys("ravishankar");
		Thread.sleep(200);

		By	byuserlastname=	By.xpath("//input[@name='lastname']");
		WebElement webuserlastname=driver.findElement(byuserlastname);
		webuserlastname.sendKeys("bind");
		Thread.sleep(100);

		By	bycompanyname=	By.xpath("//input[@name='company']");
		WebElement webcompanyname=driver.findElement(bycompanyname);
		webcompanyname.sendKeys("Apple");
		Thread.sleep(1000);

		By	byTitlename=By.xpath("//input[@id='designation']");
		WebElement webTitlenextname=driver.findElement(byTitlename);
		webTitlenextname.sendKeys("nishad");
		Thread.sleep(1000);

		By	byLeadSourcename=By.xpath("//select[@name='leadsource']");
		WebElement webLeadSourcenextname=driver.findElement(byLeadSourcename);
		webLeadSourcenextname.sendKeys("Employee");
		Thread.sleep(1000);

		By byindustryname=By.xpath("//select[@name='industry']");
		WebElement webindustrynextname=driver.findElement(byindustryname);
		webindustrynextname.sendKeys("Engineering");
		Thread.sleep(1000);

		By	byAnnual_Revenue=By.xpath("//input[@name='annualrevenue']");
		WebElement webAnnual_RevenueRs=driver.findElement(byAnnual_Revenue);
		webAnnual_RevenueRs.sendKeys("2300");
		Thread.sleep(1000);

		By bynoEmployee=	By.xpath("//input[@id='noofemployees']");
		WebElement webNoEmployee =driver.findElement(bynoEmployee);
		webNoEmployee.sendKeys("67");
		Thread.sleep(1000);

		By  bySecondaryEmailid=By.xpath("//input[@id='secondaryemail']");
		WebElement webSecondaryEmailidname=driver.findElement(bySecondaryEmailid);
		webSecondaryEmailidname.sendKeys("ravi4390@gmail.com");
		Thread.sleep(200);

		By	byleadnousername=By.xpath("//input[@id='lead_no']");
		WebElement webleadno=driver.findElement(byleadnousername);
		webleadno.sendKeys("AUTO GEN ON SAVE");
		Thread.sleep(1000);

		By byphonegive= By.xpath("//input[@id='phone']");
		WebElement  webphone= driver.findElement(byphonegive);
		webphone.sendKeys("+0931 323 573");
		Thread.sleep(1000);

		By bymobilenumber=By.xpath("//input[@id='mobile']");
		WebElement webmobilenumber=driver.findElement(bymobilenumber);
		webmobilenumber.sendKeys("7068395515");
		Thread.sleep(1900);

		By byfaxnumber=By.xpath("//input[@id='fax']");
		WebElement webfax=driver.findElement(byfaxnumber);
		webfax.sendKeys("9922836274"); 
		Thread.sleep(1000);

		By   byemailid= By.xpath("//input[@id='email']");
		WebElement webemailid=driver.findElement(byemailid);
		webemailid.sendKeys("sunilb9034@gmail.com"); 
		Thread.sleep(1000)  ;

		By  byWebsitename=By.xpath("//input[@style='width:74%;']");
		WebElement webWebsite=driver.findElement(byWebsitename); 
		webWebsite.sendKeys("https://mail.google.com");
		Thread.sleep(1000);

		By    byleadstatusname= By.xpath("//select[@name='leadstatus']");
		WebElement webleadstatusname=   driver.findElement(byleadstatusname) ;
		webleadstatusname.sendKeys("Qualified");
		Thread.sleep(1000);

		By   byratingname  =  By.xpath("//select[@name='rating']");
		WebElement webratingname=    driver.findElement(byratingname);
		webratingname.sendKeys("Active");
		Thread.sleep(1000);

		By byuserlick= By.xpath("//input[@type='radio']");
		WebElement webuserlick=   driver.findElement(byuserlick);
		webuserlick.click();

		By    byAssigneduser=  By.xpath("//select[@name='assigned_user_id']");
		WebElement webAssigned= driver.findElement(byAssigneduser);
		webAssigned.sendKeys("Administrator");
		webAssigned.click();

		By  byStreetname= By.xpath("//textarea[@name='lane']");
		WebElement webStreetname=driver.findElement(byStreetname);
		webStreetname.sendKeys("bhadohi me abhi mausam thik h ");

		By   byPostalCode= By.xpath("//input[@id='code']");
		WebElement  webPostalCode = driver.findElement(byPostalCode);
		webPostalCode.sendKeys("22");

		By bycountryname= By.xpath("//input[@id='country']");  
		WebElement webcountryname=driver.findElement(bycountryname);
		webcountryname.sendKeys("India");

		By	byPO_Boxname=By.xpath("//input[@id='pobox']");
		WebElement webPO_Boxtext=driver.findElement(byPO_Boxname);
		webPO_Boxtext.sendKeys("pass");

		By  bycityname =By.xpath("//input[@id='city']");
		WebElement webcityname=	driver.findElement(bycityname);
		webcityname.sendKeys("S.R.N. (bhadohi)");

		By	bystatename=	By.xpath("//input[@id='state']");
		WebElement webstateupname=	driver.findElement(bystatename);
		webstateupname.sendKeys("Uttar pradesh");

		By   byDescriptiontextname=	By.xpath("//textarea[@name='description']");
		WebElement webDescriptiontext=driver.findElement(byDescriptiontextname);
		webDescriptiontext.sendKeys("Costomer ne bola ki abhi decision pending hai");

//		By   bysavebutton= By.xpath("//input[@title='Save [Alt+S]']");
//		WebElement websavebutton=driver.findElement(bysavebutton);
//		websavebutton.click();
//		//	driver.close();

//		By	byCommentsInformation=By.xpath("//div[@id='contentwrap_ModCommentsDetailViewBlockCommentWidget']");
//		WebElement webCommentsInformation=	driver.findElement(byCommentsInformation);
//		webCommentsInformation.sendKeys("very good");

//		By	byAddComment=By.xpath("//textarea[@id='txtbox_ModCommentsDetailViewBlockCommentWidget']");
//		WebElement webAddComment=driver.findElement(byAddComment);
//		webAddComment.sendKeys(" good Employee");

		By	bysave=	By.xpath("//div[@align='center']");
		WebElement websave= driver.findElement(bysave);
		websave.click();
		Thread.sleep(10000);
		driver.close();
	} 

}

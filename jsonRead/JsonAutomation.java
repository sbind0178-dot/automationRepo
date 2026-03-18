package jsonRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.bouncycastle.jcajce.provider.symmetric.DSTU7624.CBC512;
import org.json.JSONArray;
import org.json.JSONObject;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class JsonAutomation {

	public static void main(String[] args) throws IOException, InterruptedException {

		//		  String[] h= {"sunil","laxmi"};
		//	  int[]xvz= {989,90};
		//	int []cc=  new int [13];
		//		CBC512 		


		byte[] ByteArr=	Files.readAllBytes(Paths.get("C:\\Users\\SUNIL BIND\\Desktop\\Automation.java"));
		String strjson= 	new String(ByteArr);
		// System.out.println(strjson);

		JSONObject jsonroot= new JSONObject(strjson);
		Number idnumber=jsonroot.getNumber("id");
		System.out.println(idnumber);

		Number created_timenumber=jsonroot.getNumber("created_time");
		System.out.println(created_timenumber);


		//JSONObject jsonJSONObject=new JSONObject(strjson);

		JSONArray arrayroot= new JSONArray();

		JSONObject jsonroot1=  arrayroot.getJSONObject(1);
		System.out.println(jsonroot1.getNumber("id"));
		
		JSONArray jsontagsWithTimeArray=	jsonroot.getJSONArray("tagsWithTime");//createdTime
		JSONObject 	tagsWiobj=jsontagsWithTimeArray.getJSONObject(0);

		String tagstring=	tagsWiobj.getString("tag");
		System.out.println(tagstring);


		Number  createdTimeNumber= tagsWiobj.getNumber("createdTime");
		System.out.println(createdTimeNumber);


		JSONArray jsonproperties=	jsonroot.getJSONArray("properties");
		JSONObject	propertiesindexNumber0=  jsonproperties.getJSONObject(0);
	String namesting=	propertiesindexNumber0.getString("name");
	System.out.println(namesting); 
	String valuename=propertiesindexNumber0.getString("value");
	System.out.println(valuename);

	JSONObject propertiesindexNumber1=	jsonproperties.getJSONObject(1);
String Lastname=	propertiesindexNumber1.getString("name");
	System.out.println(Lastname);
	
	String valuesritng=	propertiesindexNumber1.getString("value");
	System.out.println(valuesritng);
	
	JSONObject propertiesindexNumber3=	jsonproperties.getJSONObject(3);
String nameEmail=	propertiesindexNumber3.getString("name");
	    System.out.println(nameEmail);
	
	String valueEmilID  =  propertiesindexNumber3.getString("value");
     System.out.println(valueEmilID);
	
     JSONObject  propertiesindexnumber5=  jsonproperties.getJSONObject(4);
      String stringname=propertiesindexnumber5.getString("name");
	   System.out.println(stringname);
	
	Number valueNumber=propertiesindexnumber5.getNumber("value");
	System.out.println(valueNumber);
	
	JSONArray jsonarraycampaignStatus= jsonroot.getJSONArray("campaignStatus");
	   System.out.println(jsonarraycampaignStatus);
	String stringsource=   jsonroot.getString("source");
	 System.out.println(stringsource);
      Number numbercontact_company_id=	 jsonroot.getNumber("contact_company_id");
	    System.out.println(numbercontact_company_id);
	
	    ////owner
	    
	    JSONObject jsonRead=new JSONObject(strjson);
	    JSONObject JSONObject_owner=jsonRead.getJSONObject("owner");
	    
	Number numberid=JSONObject_owner.getNumber("id");
	System.out.println(numberid);
	
	String Stringdomain=	JSONObject_owner.getString("domain");
	System.out.println(Stringdomain);
	
	String Stringemail=	JSONObject_owner.getString("email");
	System.out.println(Stringemail);

	String Numbercreated_time=	JSONObject_owner.getString("phone");
			System.out.println(Numbercreated_time);
			
	
	
	
	}
}
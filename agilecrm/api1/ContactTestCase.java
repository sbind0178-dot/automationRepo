package agilecrm.api1;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ContactTestCase {  

	public static void main(String[] args) {
     
	//	System.out.println("hello");
		
	Response rest=	RestAssured.given().auth().basic("admin@rajagyanpur.com", "raja@123").
	accept("application/json").get("https://rajagyanpur.agilecrm.com/dev/api/contacts/5092333202374656");

	 String restjson= rest.getBody().asPrettyString();
	System.out.println(restjson );
	
	JSONObject jsonroot=new JSONObject(restjson);
   Number IdNumber=	jsonroot.getNumber("id");
   
   if(restjson.equals(IdNumber)==true) {
	  
	   System.out.println("it is Idnumber passed>>>>"+IdNumber);
   
	}else{
		
		System.out.println("it is Idnumber not  field>>>>"+IdNumber);
	}
	
	String stringtype=jsonroot.getString("type");
	
	if(restjson.equals(stringtype)==true) {
		System.out.println("it is Idnumber  passed>>>>"+stringtype);
	
	}else{
	System.out.println("it is Idnumber not  field>>>>"+stringtype);
	
	
	}
//	//System.out.println(stringtype);
//	
//	Number updated_timeNumber= jsonroot.getNumber("updated_time");
//	System.out.println(updated_timeNumber);
//	
//	//  "viewed": {
//	
//		JSONObject	viewedObject=jsonroot.getJSONObject("viewed");
//	Number	viewer_idNumber=viewedObject.getNumber("viewer_id");
//	System.out.println(viewer_idNumber);
//	

	}
	

}

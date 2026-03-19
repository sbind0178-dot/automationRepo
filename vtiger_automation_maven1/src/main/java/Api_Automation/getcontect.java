package Api_Automation;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getcontect {

	
//	public static void main(String[] args) {
//		Response resr=RestAssured.given().auth().basic("admin@rajagyanpur.com", "raja@123").accept("application/json")
//		.get("https://rajagyanpur.agilecrm.com/dev/api/contacts/5092333202374656");
//	String str=resr.getBody().asPrettyString();
//	System.out.println(str);
//	System.out.println(resr.statusCode());
//	
	
	public static void main(String[] args) {
		
   Response rest=RestAssured.given().auth(). basic("admin@rajagyanpur.com", "raja@123").
	 accept("application/json").get("https://rajagyanpur.agilecrm.com/dev/api/contacts");
  String stringReadData= rest.getBody().asPrettyString();
	System.out.println(stringReadData);
	
	
	JSONObject jsonroot=	new JSONObject();
	
	
	
	
	}

	
	}


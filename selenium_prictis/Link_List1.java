package selenium_prictis;

import java.util.ArrayList;

public class Link_List1 {

	public static void main(String[] args) {
      
		 ArrayList<String> name = new ArrayList<String>();
		 name.add("mohit");
			 name.add("amit");
			 name.add("mohan");
			 name.add("sunil");
			  
			 name.add(2, "sunil");	 // two metod  indexing use for change of anyouther  aliment
			 
	     String iden=  name.get(2);   //one method
	     System.out.println(iden);
			 
 		int Stringsizename=	 name.size();
		System.out.println(Stringsizename);
		String sname= name.get(2);    ///mathod use String
		System.out.println(name);
	}

}

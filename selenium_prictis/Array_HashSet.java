package selenium_prictis;

import java.util.HashSet;

import org.antlr.v4.runtime.misc.OrderedHashSet;

public class Array_HashSet {

	public static void main(String[] args) {
      
		HashSet<String> namelist=new HashSet();
		namelist.add("ajay");
		namelist.add("vikas");
		namelist.add("ajit");
		namelist.add("vijay");
		namelist.add("sunil");
		namelist.remove("2");
		System.out.println("Remove namelist=="+namelist);
		
		System.out.println("namelist of Array=="+namelist);
	}

}

package selenium_prictis;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arrayloop_practis {

	public static void main(String[] args) {



		//		Arrayloop_practis y=new Arrayloop_practis();
		//		
		//		for(int i=0; i<6; i++) {
		//			
		//		System.out.println("hello");	
		//			
		//		

	//	arrayList();


		//		int[] p= new int[10000];
		//		int count=p.length;
		//		for(int i=1; i<count; i++) {
		//			
		//		p[i]=5*i;
		//	
		//		}
//
//	}
//	public static void arrayList() {
//
//		ArrayList<Integer>  arr=	new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(20);
//		arr.add(30);
//		arr.add(34);
//		arr.add(38);
//
//
//
//		int size=arr.size();           
//		System.out.println(size);
//
//		Integer first=	arr.get(0);       ///mathod use String
//		System.out.println(first);
//
//		System.out.println(arr);
//
//		ArrayList<String> name = new ArrayList<String>();
//		name.add("mohit");
//		name.add("amit");
//		name.add("mohan");
//		name.add("sunil");	  
//		name.add(2, "sunil");
//	String remoname=	name.remove(2);
//   System.out.println("remove name=="+remoname);
//
//		int Stringsizename=	 name.size();
//		System.out.println(Stringsizename);
//	//	String sname= name.get(2);    ///mathod use String
//		System.out.println(name);

			LinkedList<String>  emp=new LinkedList<String>();
			emp.add("rahul");
			emp.add("sanddep");
			emp.add("ravi");
			emp.add("laxmi");
			emp.add("ajay"); 
			emp.add("amit");
			emp.add("ajit");	
			emp.add("baba");
			
		String getfirst=	emp.getFirst();
			System.out.println("First name " + getfirst);
		String getLast=	emp.getLast();
			System.out.println("Last name" +" i"+ getLast);
	}

}





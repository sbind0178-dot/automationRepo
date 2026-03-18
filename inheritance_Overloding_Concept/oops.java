package inheritance_Overloding_Concept;

public class oops {

	public static void main(String[] args) {
		oops oj=new oops();
		oj.add(1);
		oj.add(true);
   
	}
	public void add(int x) {     ///Overriding consept 
		System.out.println("hi");
	}
public void add(String a) {
	System.out.println("hello");	
	}
public void add(Boolean a) {
	System.out.println("b");
}
public void add(char a) {
	
}

}

package Superclass_PracticeInheritence;

public class levelVariable {
	String name ="name leval name";  //   global  variable
	
	public static void main  (String [] args) {
		levelVariable cc=	new levelVariable();
		cc.showName();
	}
     public void showName() {
    	 String name ="local name";   //this is  local variable
    	 System.out.println(name);
    	 System.out.println(this.name);  ///this .name>>> globle variable jo hai vo usko run karega  
     }
}

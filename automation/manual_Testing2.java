package automation;

public class manual_Testing2 {

	public static void main(String[] args) {
     equal();
     
	}
	public static void equal() {
		String name="vimal";
		String name1="VIMAL";
		if (name.equalsIgnoreCase(name1)) {
			System.out.println("Matched");

		}else {
			System.out.println("not Matched");
		}
		
		String name2="sunil";
		String name3="SUNIL";
		if(name2.equalsIgnoreCase(name3)) {
		System.out.println("Massage passed");
		
	}else{
		System.out.println("Massage not passed");
		
	}
}
}
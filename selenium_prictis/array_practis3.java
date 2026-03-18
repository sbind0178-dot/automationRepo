package selenium_prictis;

public class array_practis3 {

	public static void main(String[] args) {

		String[] p= {"sunil","33333","manish","anil","dhsds","sdhud","uhdud"}; 
		
//		int countitem=p.length;            // use my consept 
		String choosenumb=p[3];		        // choosenumber value 0,1,2,3
		
		
		System.out.println(choosenumb);
	//	p[3]="anil";
		for(int i=0; i<7; i++) {
			System.out.println(p[i]);
			System.out.println("*");

	}

}
}
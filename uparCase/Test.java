package uparCase;

public class Test {

	public static void main(String[] args) {


		B bb=new B();   //// load A+B
		// bb  -B- show   -A+B


		A x=new B();   //// load A+B     ///// upca sting
		// x  -B- show   -A



		//	B ss=(B) new A();  //load A      ///// Down cating 
		//	// ss  -B - show -A+B 
		//	ss.Add();	
  

		A cc=	new B();    ///load a+b

		B q=(B) cc;      /////Down cating
		q.Add();
		q.minas();

	}


}

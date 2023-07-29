package allmethod;

public class method4 extends method3{   // multilevel inheritance
	int a;
	int b;
	public method4(int a1, int b2) {  // constructor with parameter
		a=a1;
		b=b2;
		System.out.println("CONSTRUCTOR METHOD");
	}

	public static void main(String[] args) {
	method4 m4=new method4(17, 6);   // object with parameter
System.out.println(m4.a+" "+m4.b);
m4.e4();
m4.h();
m4.t1();
m4.t();
method4.t2();
m4.t3();
	}
	public static void t() {
		System.out.println("PUBLIC METHOD");
	}
	private  void t1() {
		System.out.println("PRIVATE METHOD");
	}
	protected static void t2() {
		System.out.println("PROTECTED METHOD");
	}
	  void t3() {
		System.out.println("DEFAULT METHOD");
	  }
}

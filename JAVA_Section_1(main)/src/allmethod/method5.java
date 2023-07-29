package allmethod;

public class method5 {

	public static void main(String[] args) { // access modifier call outside class
		method4 m4=new method4(12, 3);
		method5 m5= new method5(); // method overloading // compile time polymorphism
		m5.r();
		m5.r(6.7f);
		m5.r("f");
		m5.r(4);
		m5.r(0, 0);
		m4.t3();
	method4.t();
	method4.t2();
	
	

	}
	public static void r() {
		System.out.println("r METHOD");
	}
		public static void r(int a) {
			System.out.println("r int a METHOD");
		}
			public static void r(int a,int b) {
				System.out.println("r int a and b METHOD");
			}
				public  void r(String d) {
					System.out.println("r string METHOD");
				}
					public  void r(float r) {
						System.out.println("r float  METHOD");
					}
}

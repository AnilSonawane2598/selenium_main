package allmethod;

public class method2 {

	public static void main(String[] args) {
		method n1=new method();
		System.out.println(n1.d);
		method n2=new method();  // calling constructor
		method.s1("KIRAN", 5, 6, 'D', 56.98f); // CALLING static method outside the class
        n1.s2();                              // calling non static method outside class
        System.out.println(method.d );  // calling static global variable
        System.out.println(method.d1);  // calling static global variable
        System.out.println(n1.d3);  // calling non static global variable
        System.out.println(n1.d4);  // calling non static global variable
        System.out.println();
	}
	public static void e() {
		System.out.println("E METHOD");
	}
	public static void e1() {
		System.out.println("E1 METHOD");
}
	public static void e2() {
		System.out.println("E2 METHOD");
	}
	public static void e3() {
		System.out.println("E3 METHOD");
	}
	public  void e4() {
		System.out.println("E4 METHOD");
	}
	public  void e5() {
		System.out.println("E5 METHOD");
	}
}
	

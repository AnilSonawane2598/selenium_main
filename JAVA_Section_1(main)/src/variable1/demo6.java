package variable1;

public class demo6 {
	static int u=675;
	int t=435;
	
 public static void main(String [] args) {
	 System.out.println("CALLING FROM DIFFRENT CLASS");
	 
m4(); // static method direct calling
demo6.m4(); // static method calling by class
System.out.println("***************************************");
demo.demo2(); //static method calling by different class
System.out.println("******************************");
// for calling non static method we have to create object 
// object is a real time entity having same state and behaver
// object of class can be created using new keyword
demo a=new demo(); // non static method calling from different class
demo.demo4();
demo6 b=new demo6(); // non static method calling from same class
b.m3(); // object calling through same class
System.out.println("*******************************");
a.m1(); //object calling through different class
System.out.println("***************************");
a.m();// object calling through different class
	 System.out.println("***********************************");
	 System.out.println();
	 METHOD.add();
	 METHOD A=new METHOD();
	 A.sub();
	 METHOD.addition(12, 4, 6);
	 A.info("ANIL", 55, 'R', 55.77f);
	demo6.A();
	 
	 System.out.println("method end");
 }
 public void m3() {
	 int a=6;
	 System.out.println(a);
	 System.out.println(u);
	 System.out.println();
	 System.out.println("m3 method");
	 
 }
 public static void m4() {
	 System.out.println();
	 System.out.println("m4 method");
 }
 public static void  A() {
	 int a=5;
	 int b=3;
	 int c=a+b;
 System.out.println("addition of c is-->"+c);
 }
 }

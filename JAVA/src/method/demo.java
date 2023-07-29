package method;

public class demo {

	public static void main(String[] args) {
		demo d=new demo();
		d.a();
		d.a(2);
		d.a1();
		d.a2();
		d.a3();
		d.m();
		d.m(0);
		d.m1();
		d.m2();
		d.m3();
		m3();
	}
public static void m() {
	System.out.println("static public m method");
}
private static void m1() {
	System.out.println("static private m1 method");
}
protected static void m2() {
	System.out.println("static protected m2 method");
}
 static void m3() {
	System.out.println("default static m3 method");
}
 public void a() {
		System.out.println("non static public a method");
	}
 private  void a1() {
		System.out.println("non static private a1 method");
	}
 protected  void a2() {
		System.out.println("non static protected a1 method");
	}
   void a3() {
		System.out.println("non static default a3 method");
	}
   public void a(int a) {
		System.out.println("non static a method with parameter");
	}
   public static void m(int b) {
		System.out.println("static m method with parameter");
	}
}

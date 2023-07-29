package method;

public class demo1 extends demo{

	public static void main(String[] args) {
demo d=new demo();
demo1 d1=new demo1();
demo d2=new demo1();

d1.m();
d1.m(0);
d1.a3();
d1.a();
d.a();
d.a(0);
d.a2();
d.a3();
d.m();
d.m(0);
d.m2();
d.m3();
	}
	public static void m() {
		System.out.println(" override static public m method");
	}
	protected static void m2() {
		System.out.println(" override static protected m2 method");
	}
	 static void m3() {
		System.out.println("override default static m3 method");
	}
	 public void a() {
			System.out.println("override non static public a method");
		}
}

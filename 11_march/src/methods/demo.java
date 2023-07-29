package methods;

public class demo { // regular method static and non static

	public static void main(String[] args) { // main method
demo d=new demo();
d.t();
d.t(3);
d.t2();
t2();
	}
public void t() { // non static method
	System.out.println("NON STATIC METHOD");
}
public void t(int a) { // non static with parameter
	System.out.println("method with parameter");
}
public static void t2() { // static method
	System.out.println("static method");
}
}

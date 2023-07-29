package variable;

public class demo {
static int a=10;
int b=20;
public int c=30;
private int d=40;
protected int e=50;
final int f=60;
	public static void main(String[] args) {
		demo d=new demo();
		d.var();
System.out.println(a);
System.out.println(d.b);
System.out.println(d.c);
System.out.println(d.e);

	}
public void var() {
	int a=100;
	final int b=200;
	System.out.println(this.b);
	System.out.println("var "+b);
	System.out.println("global var"+this.a);
	System.out.println(a);
	System.out.println(f);
	System.out.println(e);
	
}
}

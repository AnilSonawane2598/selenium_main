package varible;

public class test {
int a=10;
static int b=20;

	public static void main(String[] args) {
		test t=new test();
t.m();
System.out.println();
	}
public void m() {
	int a=30;
	final int b=200;
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(this.b);
	System.out.println(b);
	a=40;
	System.out.println(a);
}
}

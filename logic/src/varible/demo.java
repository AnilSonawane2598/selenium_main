package varible;

public class demo {
int a=10; // no static global variable
static int b=20; // static global variable
static int c=1;
int d=2;

	public static void main(String[] args) {
		demo d=new demo();
d.r();
System.out.println(b);
System.out.println(d.a);
System.out.println();
	}
	public  void r() {
		int a=40;
		int b=50;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		System.out.println(this.a);
		System.out.println();	
	}

}

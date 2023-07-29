package testng;

public class demo {
	public static int a=10;
	public int c=5;
	public static void main(String[] args) {
		demo d=new demo();
		d.b();
		System.out.println(a);
		System.out.println(d.c);
	}

public void b()	{
	int a=20;
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(this.c);
	
}
}

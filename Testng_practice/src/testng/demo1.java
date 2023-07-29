package testng;

public class demo1 extends demo{
public int   c=5000;

	public static void main(String[] args) {

		demo1 d=new demo1();
		d.n();
	//	System.out.println(demo.a);
	}
	
	public void n() {
		int b=100;
		System.out.println(b);
		System.out.println(super.a);
		System.out.println(super.c);
		
	}

}

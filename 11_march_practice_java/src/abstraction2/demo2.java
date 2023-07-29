package abstraction2;

public class demo2 extends demo1{

	public static void main(String[] args) {
		demo1 d1=new demo1();
		d1.a1();
		d1.a2();
		d1.a3();
		d1.b();
		
		demo d=new demo1();
		d.a1();
		d.a2();
		d.a3();
		
		demo2 d2=new demo2();
		d2.a1();
		d2.a2();
		d2.a3();
		d2.b();
		
	}

}

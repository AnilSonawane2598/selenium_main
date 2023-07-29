package polymorphism;

public class override3 extends override2 {

	public static void main(String[] args) {

		override3 o2=new override3();
		o2.a();
		o2.b();
		o2.c();
		o2.d();
		o2.e();
		o2.f();
		
		override o=new override2();
		o.a();
		o.b();
		o.c();
		o.d();
		
		override2 o3=new override3();
		o3.e();
		o3.f();
		
	}

}

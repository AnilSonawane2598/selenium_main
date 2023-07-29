package inheritance;

public class single2 extends single{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
single s=new single2();
s.a();

single2 s2=new single2();
s2.a();
	}
	public static void b() {
		System.out.println("static b method");
	}
}

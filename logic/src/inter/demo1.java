package inter;

public class demo1 implements demo{

	public static void main(String[] args) {
demo1 d1=new demo1();
d1.a();
d1.a1();

demo d=new demo1();
d.a();
d.a1();
	}

	@Override
	public void a() {
System.out.println("a method");		
	}

	@Override
	public void a1() {
System.out.println("a1 method");		
	}

}

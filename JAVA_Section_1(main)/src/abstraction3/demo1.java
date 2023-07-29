package abstraction3;

public class demo1 extends demo {
	
public static void main(String[] args) {
	demo d=new demo1();  // calling abstract class method + method override
	d.a();
	d.a1();
	d.a2();
	d.a3();
}
	@Override
	public void a() {
		System.out.println("A METHOD");
		
	}

	@Override
	public void a1() {
System.out.println("A1 METHOD");		
	}

	@Override
	public void a2() {
System.out.println("A2 METHOD ");		
	}

	@Override
	public void a3() {
System.out.println("A3 METHOD");		
	}
	public  void B(){
	
	System.out.println("B METHOD");
	}
	@Override
	public void a4() {
		System.out.println("uuuuuu");
		
	}
	
	}	
	

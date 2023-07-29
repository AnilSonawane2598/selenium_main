package interffaca;

public class demo1 implements demo,test{

	@Override
	public void m() {
System.out.println(" m method");		
	}

	@Override
	public void m1() {
System.out.println(" m1 method");		
	}

	@Override
	public void m2() {
System.out.println("m2 method");		
	}

	@Override
	public void m1(int a) {
System.out.println("m1 method");		
	}

	@Override
	public void a() {
System.out.println("a method");		
	}

	@Override
	public void a1() {
System.out.println("a1 method");		
	}

	@Override
	public void a2() {
System.out.println("a2 method");		
	}
}

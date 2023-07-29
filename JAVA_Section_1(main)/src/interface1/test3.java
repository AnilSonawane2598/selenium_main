package interface1;

public class test3 implements test,test2 {  // achieve multiple inheritance and abstraction

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void b() {
System.out.println("B METHOD");		
	}

	@Override
	public void b1() {
System.out.println("B1 METHOD");		
	}

	@Override
	public void b2() {
System.out.println("b2 METHOD");		
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
System.out.println("A2 METHOD");		
	}
	public void c() {
		System.out.println("C METHOD");
	}

}

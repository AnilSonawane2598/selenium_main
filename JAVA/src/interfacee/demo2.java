package interfacee;

public class demo2 implements demo,demo1{ // multiple inheritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void a() {
System.out.println("a i method");		
	}

	@Override
	public void a1() {
		System.out.println("a1 i method");		
		
	}

	@Override
	public void a2() {
		System.out.println("a2 i method");		
		
	}

	@Override
	public void b() {
		System.out.println("b i method");		
		
	}

	@Override
	public void b1() {
		System.out.println("b1 i method");		
		
	}

	@Override
	public void b2() {
		System.out.println("b2 i method");		
		
	}

}

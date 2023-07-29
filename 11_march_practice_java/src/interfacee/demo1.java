package interfacee;

public class demo1 implements demo,test { // multiple inheritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void a() {
		System.out.println("interface a method");
	}

	@Override
	public void a1() {
		System.out.println("interface a1 method");
	}

	@Override
	public void a2() {
		System.out.println("interface a2 method");		
	}

	@Override
	public void b() {
		System.out.println("interface b method");
		
	}

	@Override
	public void b1() {
		System.out.println("interface b1 method");
		
	}

	@Override
	public void b2() {
		System.out.println("interface b2 method");
		
	}
	public void c1() {
		System.out.println(" c1 method");
		
	}
	public void c2() {
		System.out.println(" c2 method");
		
	}
	public void c3() {
		System.out.println(" c3 method");
		
	}
	

}

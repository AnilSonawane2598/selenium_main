package handleexception;

public class stackoverflowex {
	
	// stack over flow error example
static int a=0;
	public static void main(String[] args) {
		b();
	}
	public static void b() {
		if(a<100000) {
			System.out.println("hi");
			a++;
			b();
		}
	}
}

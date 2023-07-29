package exception;

public class arithmetic {

	// arithmetic exception
	public static void main(String[] args) {
		System.out.println("hi");
		try {
		int a=10/0;
		}
		catch(ArithmeticException a) {
			System.out.println(a.getMessage());
			a.printStackTrace();
		}
		System.out.println("hello");
	}

}

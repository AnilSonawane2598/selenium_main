package handleexception;

public class demo {

	public static void main(String[] args) {
		int a=10;
		try {
		int div=a/0;
	}
		catch(ArithmeticException b) {
			System.out.println(b.getMessage());
			b.printStackTrace();
		}
		finally {
			System.out.println("show code");
		}
}
}
package exception;

public class stackoverflow {
	static int a = 0;

	public static void main(String[] args) {
		try {
			b();
		} catch (StackOverflowError s) {
			System.out.println(s.getMessage());
			s.printStackTrace();
		}
	}

	public static void b() {
		if (a < 10000000) {
			System.out.println("hello");
			a++;
			try {
				b();
			} catch (StackOverflowError d) {

			}
			System.out.println("anil");

		}
	}
}

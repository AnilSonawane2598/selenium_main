package testng;

public class stackoverflow {
	public static int a =0;

	public static void main(String[] args) {
		b();
	}

	public static void b() {
		if (a < 100000) {
			System.out.println("a");
			a++;
			b();
		}
	}

}

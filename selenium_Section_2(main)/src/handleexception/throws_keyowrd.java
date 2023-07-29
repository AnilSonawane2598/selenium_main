package handleexception;

public class throws_keyowrd {

	public static void main(String[] args) {
		throws_keyowrd tk=new throws_keyowrd();
		tk.a();
		System.out.println("anil");
	}
	public  void a() {
		try {
		b();
	}
		catch(ArithmeticException a) {
			System.out.println("sonawane");
		}
			
		}
	public  void b() throws ArithmeticException,NullPointerException{
		int a=10/0;
		int b=100/0;
		System.out.println("sonawane");
	}

}

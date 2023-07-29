package testng;

public class exceptionhandle {
 //ArithmeticException
	public static void main(String[] args) {
		System.out.println("anil");
try {
		int a=10/0;
		
	}
catch(ArithmeticException e) {
	int a=10/0;
	e.printStackTrace();
	System.out.println(a);
}

	}
}

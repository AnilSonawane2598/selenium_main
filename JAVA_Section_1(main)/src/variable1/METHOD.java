package variable1;

public class METHOD {
	static int t=67;
	public static void main(String [] args) {
		METHOD.addition(13, 67, 88);// method call with parameter
	add(); // direct calling (without parameter)
	demo6.m4(); // static method call using static key word
	demo6 r= new demo6();
	r.m3();
	addition(5, 4, 20);// direct calling with parameter
	System.out.println("*************************************************************");
	METHOD b=new METHOD();    // non static calling with parameter
	b.info("ANIL", 12, 'A', 55.7f);  // object call with parameter
	
	
	}
	public static void addition(int a,int b,int c) { // static method with parameter
		int d;
		d=a+b+c;
		System.out.println("addition is--->"+d);
		
	}
	public static void add() { // static method without parameter
		int a=3;
		int b=4;
		int e=a+b;
	System.out.println(e);
		
	}
	public void sub() { //non static method without parameter
		int a=3;
		int b=5;
		int c=a+b;
		System.out.println("sub is--->"+c);
	}
	public void info(String name, int mark, char grad, float percentage) { // non static with parameter
		System.out.println("NAME-->  "+name+"  mark  "+mark+"  GRADE  "+grad+"  percentage  "+percentage+"%");
	}

}

package allmethod2;
public class acc2 extends acc{ // calling subclass  / METHOD OVERRIDING

	public acc2(int a1, int b2) {  // constructor
		super(a1, b2);

	}
	public static void main(String[] args) {
acc a2=new acc(2, 4);  // METHOD OVERRIDING
a2.p();
a2.p1();
a2.p2();
System.out.println();
acc2 a4=new acc2(3, 5);
a4.p1();


	}
	public static void p() {
		System.out.println("PT method");
	}
	public static void p1() {
		System.out.println("PT1 method");
	}
	public static void p2() {
		System.out.println("PT2 method");
	}

}

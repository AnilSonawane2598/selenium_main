package allmethod2;

import allmethod.method4;

public class acc extends method4{   // access modifier call outside package

	public acc(int a1, int b2) {
		super(a1, b2);
	}

	public static void main(String[] args) {
method4 m4=new method4(0, 0);
acc a1=new acc(4, 5);
a1.t2();
m4.t();

	}
	public static void p() {
		System.out.println("p method");
	}
	public static void p1() {
		System.out.println("p1 method");
	}
	public static void p2() {
		System.out.println("p2 method");
	}

}

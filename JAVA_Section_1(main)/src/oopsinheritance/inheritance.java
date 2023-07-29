package oopsinheritance;
import accessmodifier.PRIVATECLASS;
public class inheritance extends PRIVATECLASS { 
	public static void main(String[] args) {
		inheritance i1=new inheritance();
		i1.rt(); // calling protected class
	}
public static void m1() {
	for(int i=20;i>=10;i=i-2) 

	System.out.println(i);
	}
public void m2() {
	System.out.println("KIRAN");
}
public static void m3() {
	System.out.println("ANIL");
}
}
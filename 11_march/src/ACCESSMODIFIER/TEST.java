package ACCESSMODIFIER;

public class TEST {

	public static void main(String[] args) {
TEST t=new TEST();
	t.m();
	t.m1();
	t.m2();
	t.m3();
	}
public void m() {
	System.out.println("public method"); // access inside class and outside class and outside package
			
}
private void m1() {
	System.out.println("private method"); //for only within the class
}
	protected  void m2() {
		System.out.println("protected method"); // with and outside package using child class
	}
	  void m3() {
			System.out.println("default");// only for same package
} 
}

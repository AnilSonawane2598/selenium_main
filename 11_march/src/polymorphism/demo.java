package polymorphism;

public class demo { // method overloading
public static void main(String[] args) {
	s();
	s(1);
	s(2.5f);
	s("a");
}
public static void s() {
	System.out.println("kiran");
	
}
public static void s(int a) {
	System.out.println("ANIL");
}
	public static void s(float v) {
		System.out.println("s with");
	}
		public static void s(String a) {
			System.out.println("s morlod");
		}
}
package polymorphism;

public class methodoverload {

	public static void main(String[] args) {
methodoverload m1=new methodoverload();
m1.d();
m1.d(12);
m1.d("KIRAN");
d(12, 45.76f);
methodoverload.d(143, 354);

	}


public void d() {
	System.out.println("ANIL 1");
}
public void d(int w) {
	System.out.println("ANIL 2");
}
public void d(String g) {
	System.out.println("ANIL 3");
}
	public static void d(int a, int b) {
	int	sum=a*b;
		System.out.println(sum);
	}
		public static void d(int y, float j) {
			System.out.println("ANIL 4");
		}
		public static void d(int y, float j,double g) {
			System.out.println("ANIL 4");
		}
}

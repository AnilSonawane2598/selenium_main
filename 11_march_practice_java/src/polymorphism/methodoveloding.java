package polymorphism;

public class methodoveloding {

	public static void main(String[] args) {
		methodoveloding m=new methodoveloding();
		m.a();
		methodoveloding.a('s');
		a(4,6);
		a(4);

	}
		public  void a() {
			System.out.println("a method");	
	}
		public static void a(int a) {
			System.out.println("a method with int a");	
		}
			public static void a(int a,int b) {
				System.out.println("a method with int a and b");	
			}
				public static void a(char a) {
					System.out.println("a method with char a");	
				}
}

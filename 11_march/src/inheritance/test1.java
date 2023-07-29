package inheritance;

public class test1 extends test  { // single inheritance

	public static void main(String[] args) {
		test1 y1=new test1();
		s();
		y1.s1();
		y1.w();
		y1.w1();
		
	}
		public  void w() {
			System.out.println("ramesh");
	}
		public  void w1() {
			System.out.println("kiran");
}
}
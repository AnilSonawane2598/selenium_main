package casting;

public class cas2 extends cas1{
	
	public  void b() {
		System.out.println("B METHOD ");

}
	public static void main(String[] args) {
		cas2 c2=new cas2(); // cpt+ early binding 
		c2.a();
		c2.a1();
		c2.b();
		System.out.println();
		cas1 c1=new cas2();// run time + up casting
		c1.a();
		c1.a1();
		System.out.println();
		cas2 c3=(cas2) new cas1(); // dowm casting
		c3.a();
		c3.a1();
		c3.b();

	}
}
package constructor;

public class construct1 {
	int a=566;
	String k="OMI";
	static int p=456;
	public construct1() {
		System.out.println(a);
	
		System.out.println(k);
		System.out.println("**************");

		
	}
	public static void main(String[] args) {
	a1();
/*truct1 a=new construct1 ();
construct1 a1=new construct1();
construct1 a2=new construct1();
construct1 a3=new construct1();
construct1 a4=new construct1();
construct1 l=new construct1();
System.out.println(l.a);
System.out.println(p);
a1();*/
	
	}
public void m2() {
	System.out.println(k);
}
public static void a1() {
	int sum=0;
	for(int p=1;p<=15;p++)
		sum=sum+p;
		System.out.println(sum);

}
}

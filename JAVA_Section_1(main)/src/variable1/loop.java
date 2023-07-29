package variable1;
import  V2.localvariable;
public class loop {
int a=56;
public String n="ANIL";
static int d=86;
	public static void main(String[] args) {  // non static calling method
	loop a=new loop();
	
			System.out.println(a.n);
			System.out.println(a.a);
			System.out.println(loop.d);
			System.out.println("***********************************");
			localvariable o=new localvariable();
			System.out.println(o.n);
			System.out.println(METHOD.t);
			loop i=new loop();
			i.l1();
	}
public  void l1() {
	System.out.println("RAM");
	System.out.println(d);
	System.out.println(a);

}
public static void main(int[] args) {
	
}
}
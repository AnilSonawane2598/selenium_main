package casting;

public class demo1 {

	public static void main(String[] args) {
		a();
demo d=new demo();
System.out.println(d.r);
System.out.println(demo.t);
int mark=90;
if(mark>=85) {
	System.out.println("distinct");
}
else if(mark>=75) {
	System.out.println("first class");
}
else
	System.out.println(" pass");
	}
	
	
	public static void a() {
		int a=1000;
		int b=200;
		int c=30;
		if(a>b) {
			if(a>c) {
System.out.println("a is big");
		}
		}
		else if(b>c){
			System.out.println(" b is big");
		}
	
		else {
			System.out.println("c is big");
		}
}
}
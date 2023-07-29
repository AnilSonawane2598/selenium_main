package variable;

public class demo { // global variable
int a=50;
int b=10;
public static int c=20;
static String e="anil";

public static void main(String[] args) {
	
	demo d=new demo();
	d.local();
	System.out.println(d.a+d.b);
	System.out.println(c+d.e);
}
public static void local() { // local variable 
	int a; // variable declaration 
	a=5;// variable initialization
	int b=100;
	System.out.println(a+b);
}

}

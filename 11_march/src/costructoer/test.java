package costructoer;

public class test { // constructor with parameter
	 int a;
	static int b;
public test(int a1, int b1) {
a=a1;
b=b1;
System.out.println(a+b);
}
public static void main(String[] args) {
	test t=new test(5, 10);
	test t2=new test(5, 10);
	System.out.println(b+t.a);
	
}

}

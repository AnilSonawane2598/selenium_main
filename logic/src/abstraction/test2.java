package abstraction;

public class test2 {

	public static void main(String[] args) {
test1 t1=new test1(); // method overloading 
t1.m();
t1.m1();
t1.m2();
t1.m3();
System.out.println();

test t=new test1(); // method overrriding
t.m();
t.m1();
t.m2();


	}
	

}

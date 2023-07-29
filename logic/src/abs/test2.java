package abs;

public class test2 {

	public static void main(String[] args) {
test1 t1=new test1(); // method overloading
t1.m();
t1.m1();
t1.m2(5);

test t=new test1(); // method overriding
t.m();
t.m1();
	}

}

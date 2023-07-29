package method;

public class test1 {

	public static void main(String[] args) {
		test t=new test();
		t.a();
		t.b1();
		t.b3();
		t.c();
		t.b2();
		methodoverride m=new methodoverride();
		m.b1();
		m.b2();
		m.b3();
		m.c();
		methodoverride m1=new test();
		m1.b1();
		m1.b2();
		m1.b3();
		m1.c();
		
	}

}

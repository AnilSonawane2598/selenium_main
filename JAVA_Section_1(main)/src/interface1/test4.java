package interface1;

import accessmodifier.publicclass;

public class test4 extends publicclass{

	public static void main(String[] args) {
		test2 t2=new test3();
		t2.b();
		t2.b1();
		t2.b2();
		System.out.println();
		test t=new test3();  // method overriding
		t.a();
		t.a1();
		t.a2();
		System.out.println();
		publicclass pb=new publicclass();
pb.h1();
test4 t4=new test4();
t4.h1();
t4.h2();
	}

}

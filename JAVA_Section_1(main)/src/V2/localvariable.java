package V2;

import variable1.loop;

public class localvariable {
static int a=10;  //  static global variable 
static String NAME="ANIL";
 static char b='B';
static float r=88.7f;
 public int n=67;
 int i=67;
 String g="rahul";
 
public static void main(String [] args) {
	System.out.println(localvariable.b);
	localvariable c=new localvariable();
	c.m();
	System.out.println(NAME);
	System.out.println();
	System.out.println("AAAAAAAAAAAAA");
	System.out.println(c.n);
	System.out.println("*************************************");
	m1();
	System.out.println("*************************************");
	
	localvariable h=new localvariable();
	System.out.println(h.n);
	System.out.println("*************************************");
	loop a=new loop();
	System.out.println(a.n);
	System.out.println();
	localvariable m=new localvariable();
	System.out.println("int m value  "+m.n);
}
public void m() {
	System.out.println(NAME);
	NAME="RAHUL";
	System.out.println(NAME);
	System.out.println(b);
	System.out.println(a);
	a=63498;
	System.out.println(a);
	System.out.println(r);
	System.out.println(n);
	System.out.println(n);
	System.out.println(NAME);
	System.out.println(n);
}
public static void m1()	{  // NON STATIC local variable
 String a="KOMAL";
  String name;
 name="ANIL";
int y=17;
 
	System.out.println(a);
	System.out.println(name);
	System.out.println(b);
	System.out.println(r);
	System.out.println(b);
	System.out.println(y);
	System.out.println(localvariable.b);
	
}	


}

package constructor;

import accessmodifier.publicclass;

public class newcn extends publicclass {
	int e=50;   // non static global variable
	static int h=645; // static global variable
public static void main(String[] args) {
	newcn nc=new newcn();
	nc.a();
	System.out.println("******************");
	nc.a1();
	System.out.println("******************");
	nc.a2();
	System.out.println("******************");
	a3("ANIL", 4, 'A');  // method calling with parameter
	System.out.println("******************");
	construct1.a1();  //static  method calling from different class
	construct1 ct=new construct1();  //  non static method calling from different class
	ct.m2();
	publicclass p2=new publicclass();
	newcn n1=new newcn();
	n1.h2();
	p2.h1();
//	p2.h2();
	//p2.h3();
	//p2.h4();
	
	
	
	
}
public void a() {  // if else ladder
	int year=301;
	if(year%4==0) {
		System.out.println("LEAP YEAR");
	}
	else if(year%400==0) {
	
		System.out.println("leap year");
	}
	else
{
	System.out.println("not leap year");
}
}
public void a1() { // nested if else
	int a=5700000;
	int b=69999997;
	int c=5656;
	
	if (a > b) {
		if (a>c) {
			System.out.println("A IS BIG");
		}
	}
	else  if(b > c) {
			System.out.println("B IS BIG ");
		}
		else {
			System.out.println("C  is big");
		}
	System.out.println(newcn.h);  // static global variable calling
}
public void a2() { // FOR LOOP
	int sum=3;  // non static local variable
	for(int i=1;i<=10;i++)
		System.out.println(sum*i);
	
}
public static void a3(String name, int mark,char grade) { // METHOD WITH PARAMETER
	System.out.println(name+" "+mark+" "+grade);
}

}


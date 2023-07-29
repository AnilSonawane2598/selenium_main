package constructor;

import accessmodifier.publicclass;

public class needofcon extends publicclass{
	// VARIABLE DECLAR
	int a;  // non static global variable
	int g;
	String name;
	char h;
	public needofcon(int a1,int g1,String name1,char h1) { // constructor with parameter
		// VARI INITIATE
		a=a1;
		g=g1;
		name=name1;
		h=h1;
	}
public static void main(String[] args) {
	
	newcn ne=new newcn();
	ne.a1();
	
	// CREATE OBJECT
needofcon nd=new needofcon(4,5677,"A",'A');
needofcon nd1=new needofcon(45,7898,"ANIL",'S');
needofcon nd2=new needofcon(4,5677,"KIO",'O');


// PRINTING STATEMENT USAGES
System.out.println(nd.a+"  "+nd.g+nd.h);
System.out.println(nd1.g+" hi"+nd1.a+nd1.name+nd1.h);
System.out.println(nd2.a+nd2.g+nd2.name+nd2.h);
System.out.println("***************************");
System.out.println();
publicclass p4=new publicclass();
p4.h1();
}
}

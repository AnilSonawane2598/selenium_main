package allmethod;

public class method {
	static int d=20; // static global variable
	static String d1="PRITI";  // static global variable 
	int d3=10;  // non static global variable
	String d4="POOJA";  // non static global variable
	public method() {  // CONSTRUCTOR WITHOUT PARAMETER
		System.out.println("VISHWAS");
	}
	public method(int a,String b) {  // CONSTRUCTOR WITH PARAMETER
		d=a;
		d4=b;
	}
	
public static void main(String [] args) {
	s1("ANIL", 90, 5, 'A', 89.76f); // calling static method directly
	method.s(); // calling static method through class name
	System.out.println();
	method m1=new method();  // object create non static method and for calling constructor
	m1.s2();  // calling non static method
	m1.s3();
	m1.s4();
	m1.s5();
	method.s6();
	m1.s7();
	System.out.println(d1);  // calling static global variable
	System.out.println(method.d); // calling static global variable
	System.out.println(m1.d3);  // calling non static global variable
	System.out.println(m1.d4);  // calling non static global variable
	 System.out.println();
	 method m2=new method(); // method use fo constructor 
	 System.out.println(m2.d+"  "+m2.d4);  // calling constructor with parameter
	 
}
public static void s() { // static method without parameter
	System.out.println("static s method WITHOUT PARAMETER");
}
public static void s1(String name,int mark,int rollnumber,char grade,float percentage) { // static method with parameter
	System.out.println("name  "+name+" "+" mark  "+mark+" rollnumber  "+rollnumber+"  grade  "+grade+"  percentage  "+percentage);
}
public void s2() {   // NON STATIC METHOD
	int a=234;  // NON STATIC LOCAL VARIABLE
	char a1='A';    // NON STATIC LOCAL VARIABLE
	String a2="PAWAN"; // NON STATIC LOCAL VARIABLE
	
	System.out.println(a+"  "+a1+" "+a2);
	System.out.println(d4);   // calling non static global variable
}
public void s3() {  //  non static method with for loop
	int sum=30;
	for(int i=1;i<=10;i++) 
		System.out.println("30*"+i+"="+sum*i);
}
public void s4() {  // non static method with for loop
int sum=0;
	for(int i=0;i<=20;i++) 
		sum=sum+i;{
		System.out.println(sum);
		}
}
public void s5() {  // non static method with if else ladder statement
	int mark=34;
	if (mark>=75) {
		System.out.println("A GRADE");
	}
	else if(mark>=65) {
		System.out.println("B GRADE");
	}
	else if(mark>=55) {
		System.out.println("C GRADE");
	}
	else if(mark>=35) {
		System.out.println("D GRADE");
	}
	else
		System.out.println("FAILED");
}
public static void s6() {  // static method with if else ladder
	int year=2024;
	if(year%4==0) {
		System.out.println("LEAP YEAR");	
}
else if(year%400==0) {
		System.out.println("LEAP YEAR");
}
else 
	System.out.println("NOT LEAP YEAR");
}
public void s7() {  // non static method with nested if else statement
	int a=10000;
	int b=246;
	int c=67;
	
	if (a>b) {
		if(a>c) {
			System.out.println("A IS BIG VALUE");
		}}
		else if (b>c) {
			System.out.println("B IS BIG VALUE");
		}
		else {
			System.out.println("C IS BIG VALUE");
}
}

}


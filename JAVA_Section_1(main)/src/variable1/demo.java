package variable1;

public class demo {  // CLASS BODY
	public static void main(String [] args) { // MAIN METHOD TO EXECUTE THE CODE
		System.out.println("ANIL SONAWANE"); //PRINTING STATEMENT
		System.out.println("METHOD START");
		demo2();  //CALLING METHOD IN SAME CLASS (direct calling )
		System.out.println("****************************************");
		System.out.println();
		demo.demo2();  // CALLING METHOD THROUGH CLASS 
		System.out.println();
		System.out.println("************************************");
		demo3();
		System.out.println("****************************");
		demo.demo4();
		System.out.println();
		System.out.println("*****************************************");
		demo a= new demo();
		a.m();
		System.out.println("****************************");
		a.m1();
		 
		
	}
public static void demo2() { // METHOD 2 VARIABLE
	
	//VARIABLE DECLARATION
	String NAME;
	String SIRNAME;
	int MARK;
	char grade;
	float percentage;
	
	// VARIABLE INITIALIZATION
	
	NAME="ANIL";
	SIRNAME="SONAWAME";
	MARK=66;
	grade='A';
	percentage=45.3f;
	
	// USAGE
	
	System.out.println("name-->"+NAME);
	System.out.println("SIRNAME-->"+SIRNAME);
	System.out.println("mark-->"+MARK);
	System.out.println("grade-->"+grade);
	System.out.println("percentage-->"+percentage+"%");
	
}
public static void demo3() { // METHOD 3 MATH
	int a=4;
	int b=6;
	int c=10;
	double d=4567787;
	double e=a+b;

	System.out.println("ADDITION--->"+(a+b));
	System.out.println(e);
	System.out.println(c+d);
	System.out.println(a-b);
	
}
public static void demo4() {  // METHOD 4 DATA TYPE
	byte B=5;
	int i=345;
	char c='A';
	short s=3456;
	float f=456.3f;
	long l=4356788;
	double d=4567.13456;
	boolean b=true;

	System.out.println("byte value is--"+B);
	System.out.println("int value--."+i);
	System.out.println("short value-->"+s);
	System.out.println("char value-->"+c);
	System.out.println("float value--->"+f+"%");
	System.out.println("long value--->"+l);
	System.out.println("double value--->"+d+"%");
	System.out.println("boolean value-->"+b);
	
	
	
}
public void m() {
	System.out.println("im anil");
}
public void m1() {
	System.out.println("hello");
	
}


}

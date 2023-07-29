package variable1;

public class nestedifelse {

	public static void main(String[] args) {
System.out.println("*****************************************");
System.out.println("*****************************************");
System.out.println("******************************************");
m4();
nestedifelse a=new nestedifelse();
a.m3();
m5();
	}
	public static void m1() {  // if else ladder condition
		int a=900;
		int b=100;
		int c=6;
	
		if(a>b) {
			System.out.println("A is big value");
			
		}
		else if(b>c) {
			System.out.println("B is big value");
			
		}
		else {
			System.out.println("C is big value");
		}
	
		}
	
public void m2() {  // if else ladder non static 
	int a=6;
	if (a==1) {
		System.out.println("SUNDAY");
	}
	else if (a==2) {
		System.out.println("MONDAY");
}
	else if (a==3) {
		System.out.println("tuesday");
}
	else if (a==4) {
		System.out.println("wednsday");
	}
	else if (a==5) {
		System.out.println("thirsday");
	}
	else if (a==6) {
		System.out.println("friday");
	}
	else  {
		System.out.println("sat");
	}
}

public void m3() { // nested if else condition
	int a=60;
	int b=40;
	int c=50;
	
	if (a>b){
		if(a>c) {
			System.out.println("a is big");
		}
			}
			else if(b>c) {
				System.out.println("B is big");
				
			}
			else {
				System.out.println("C IS big");
			}
		}
public static void m4() {
	for(int a=1; a<=10;a++){
		System.out.println("ANIL");
		
	}
	System.out.println("LOOP END");
}
public static void m5() {
	for(int a=10;a<=0;a--) {
		System.out.println(a);
	}
}
}

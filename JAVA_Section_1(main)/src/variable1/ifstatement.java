package variable1;

public class ifstatement {

	public static void main(String[] args) {
System.out.println("*********************************");
m1();
System.out.println("*********************************");
m2();
System.out.println("**********************************");
m3();
System.out.println("**********************************");
m4();
System.out.println("**********************************");
m5();
System.out.println("**********************************");
m6();
System.out.println("**********************************");
m7();
System.out.println("**********************************");
m7();
m8();

}

	public static void m1() {  // for loop for sum of first 15 no
	int sum=0;
	for(int i=1;i<=15;i++) 
		sum=sum+i;
		System.out.println(sum);
		
	}
public static void m2() { // if else ladder statement leap year
	int year=2004;
	if(year%4==0) {
		System.out.println("YEAR IS LEAP");
	}
	else if (year%400==0) {
		System.out.println("YEAR IS  LEAP");
	}
else 
	System.out.println("NOT LEAP YEAR");
}
	
public static void m3() {  // using for loop multiplication of 9th table
	int sum=9;
	for (int i=1;i<=10;i++)
		System.out.println("9 *"+i+"="+sum*i);
}
public static void m4()	{ // sum of first 15 no using while loop
	int sum=0;
	int i=1;
	while(i<=15) {
		sum=sum+i;
	i++;
	}
	
	System.out.println(sum);
}
public static void m5() {
	int a=23;
	if (a%2==0) {
		System.out.println("EVEN no");
	}	
	else
		System.out.println("odd no");
}
public static void m6() {
	for(int i=1;i<=10;i=i+2) {
		System.out.println(i);
	}
}
public static void m7() {  // 2nd multiplier using for loop
	int sum=2;
	for(int i=1;i<=10;i++) {
		System.out.println("2*"+i+"="+sum*i);
	}
}
public static void m8() {
	int i=1;
	int sum=0;
	while(i<=10);{
	sum=sum*i;
		System.out.println(sum);
	
}

}}

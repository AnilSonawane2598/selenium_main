package allmethod2;

public class acc3 {

	public static void main(String[] args) {
	int year=600;
	if((year%4==0)&&(year%400==0)||(year%100==0)) {
		System.out.println("LEAP YEAR");
	}
	else 
		System.out.println("NOT LEAP YEAR");
	w2();
	}
	public static void w2() { // FOR LOOP PROGRAM
		int sum=1;
		for(int i=1;i<=10;i++) 
			sum=sum*i;
			System.out.println(sum);
			System.out.println();
			acc3 a3=new acc3();
			a3.r1();
			System.out.println();
			a3.r2();
			System.out.println();
			a3.r3();
	}
	public  void r1() {  // IF ELSE LADDER PROGRAAM
	int	day=6;
		if(day==1) {
			System.out.println("MONDAY");
		}
		else if(day==2) {
		System.out.println("TUESDAY");
	}
		else if(day==3) {
		System.out.println("WENDAY");
	}
		else if(day==4) {
		System.out.println("THURSDAY");
	}
		else if(day==5) {
		System.out.println("FRIDAY");
	}
		else if(day==6) {
		System.out.println("SATURDAY");
	}
		else  
		System.out.println("SUNDAY");	
	}
	public void r2() {
	//int	sum=0;
		for(int i=1;i<=20;i=i+4) {
		//	sum=sum+i;
			System.out.println(i);
			
		}
	}
	public void r3() {  // ODD VS EVEN NUMBER PROGRAM
	int	number=6;
	if(number%2==0) {
		System.out.println("EVEN NUMBER");
	}
	else
		System.out.println("ODD NUMBER");
	}
	}


package logical_main;

import java.util.Scanner;

public class palindromenumber {

	public static void main(String[] args) {
		int originalnumber,rem,sum;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		originalnumber=num;
		//121
		//0        121>0    121/10=12
		//1   		1>0		
		for(sum=0;num>0;num=num/10) {
			rem=num%10;  // 121%10=12 ,1%10=1
			sum=sum*10+rem;   //0=0*10+1=1,
		}
		if(sum==originalnumber) {
			System.out.println("palindrom number");
		}
		else {
			System.out.println("not a palindrom number");
		}
	}

}

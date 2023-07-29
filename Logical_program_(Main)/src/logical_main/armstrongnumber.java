package logical_main;

import java.util.Scanner;

public class armstrongnumber {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int p;
		int rem;
		int sum;
		p=num;
		for(sum=0;num>0;num=num/10) {
			rem=num%10;
			sum=sum+rem*rem*rem;
		}
		if(sum==p) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}
	}

}

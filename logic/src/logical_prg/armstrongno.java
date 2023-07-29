package logical_prg;

import java.util.Scanner;

public class armstrongno {

	public static void main(String[] args) {
		int p,rem,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		p=num;
		for( sum=0;num>0;num=num/10) {
			rem=num%10;
			sum=sum+rem*rem*rem;
		}
		if(sum==p) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not a armstrong number");
		}
			
	}

}

package program3;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i;
		
		for( i=2;i<num;i++) 
			if(num%i==0)
				break;
			if(i==num) {
				System.out.println("prime number");
			}
			else {
				System.out.println("not a prime number");
			}
	}
}

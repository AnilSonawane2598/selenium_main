package prg2;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int i;
		for ( i = 2; i < num; i++) 
			if (num % i == 0)
				break;
			if (i == num) 
				System.out.println("prime number");
			 else 
				System.out.println("not prime number");
	
		
	}

}

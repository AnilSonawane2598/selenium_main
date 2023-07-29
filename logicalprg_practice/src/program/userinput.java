package program;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		System.out.println("enter no");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		System.out.println("enter second no");
		int b=sc.nextInt();
		System.out.println(a+b);
	}

}

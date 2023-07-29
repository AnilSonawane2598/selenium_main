package program3;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int sum;
		int rem;
		int original = num;

		for (sum = 0; num > 0; num = num / 10) {
			rem = num % 10;
			sum = sum * 10 + rem;
		}
		if (sum == original) {
			System.out.println("palindrom number");
		} else {
			System.out.println("not palindrom number");
		}
	}

}

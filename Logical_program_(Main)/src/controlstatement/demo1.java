package controlstatement;

public class demo1 {

	public static void main(String[] args) {
		int a=100;
		int b=20;
		int c=30;
		if(a>b) {
			if(a>c) {
				System.out.println("max a");
			}
		}
		else if(b>c) {
			System.out.println("b max");
		}
		else
			System.out.println("c max");
	}

}

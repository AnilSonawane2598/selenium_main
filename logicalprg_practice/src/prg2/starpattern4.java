package prg2;

public class starpattern4 {

	//pyramid
	public static void main(String[] args) {
		for (int i = 9; i>=0; i--) {
			for (int j = 5; j >=0; j--) {
				if (j <=1+ i && j >=- i) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

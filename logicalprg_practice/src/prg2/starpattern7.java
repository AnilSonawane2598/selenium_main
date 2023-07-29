package prg2;

public class starpattern7 {

	public static void main(String[] args) {
		{
			// for print number
			int number, n = 4;
			// loop for rows
			for (int i = 0; i < n; i++) {
				number = 1;
				// loop for columns
				for (int j = 0; j <= i; j++) {
					// prints num
					System.out.print(number + " ");
					// incrementing the value of number
					number++;
				}
				// throws the cursor at the next line after printing each row
				System.out.println();
			}
		}
	}

}

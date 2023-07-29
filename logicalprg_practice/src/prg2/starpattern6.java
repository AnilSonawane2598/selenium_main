package prg2;

public class starpattern6 {

	public static void main(String[] args) {
		{
			int k = 1;
			// inner loop
			for (int i = 1; i <= 7; i++) {
				// outer loop
				for (int j = 1; j < i + 1; j++) {
					// prints the value of k
					System.out.print(k++ + " ");
				}
				// throws the cursor at the next line
				System.out.println();
			}
		}
	}

}

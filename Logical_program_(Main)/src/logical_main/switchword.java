package logical_main;

public class switchword {

	public static void main(String[] args) {
		String s = "Anil Sonawane";
		String[] word = s.split(" ");
		StringBuilder result = new StringBuilder();

		for (int i = word.length - 1; i >= 0; i--) {
			result.append(word[i]).append(" ");
			// Append each word in reverse order with a space
		}

		String s1 = result.toString().trim();
		System.out.println(s1);
	}

}

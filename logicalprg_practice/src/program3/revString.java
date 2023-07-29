package program3;

public class revString {

	public static void main(String[] args) {
		String a = "anil balu Sonawane";
		String b[] = a.split(" ");
		String c = "";
		for (String data : b) {
			String s = "";
			{
				for (int i = data.length() - 1; i >= 0; i--)
					s = s + data.charAt(i);
			}

			c = c + s + " ";
		}
		System.out.println(c);

	}
}

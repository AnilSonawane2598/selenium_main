package logic_program_practice;

public class reveachString {

	public static void main(String[] args) {
		String s = "anil balu sonawane";
		String str[] = s.split(" ");
		String rev = "";
		for (String data : str) {
			String s1 = "";
			for (int i = data.length() - 1; i >= 0; i--) {
				s1 = s1 + data.charAt(i);
			}
			rev = rev + s1 + " ";
		}
		System.out.println(rev);
	}

}

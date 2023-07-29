package logic_program_practice;

public class countstring {

	public static void main(String[] args) {
		String s = "anil balu sonawane&&wef";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) != ' ') && (s.charAt(i)!='&')) {
				count++;
			}
		}
		System.out.println(count);

	}

}

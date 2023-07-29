package logical_main;

import java.util.HashMap;
import java.util.Map;

public class charstring {

	public static void main(String[] args) {

		String s = "Anilsonawane";
		char c[] = s.toCharArray();
		Map<Character, Integer> num = new HashMap<>();
		for (char data : c) {
			if (num.containsKey(data)) {
				num.put(data, num.get(data) + 1);
			} else {
				num.put(data, 1);
			}
		}
		System.out.println(num);
	}

}

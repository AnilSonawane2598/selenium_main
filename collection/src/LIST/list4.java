package LIST;


import java.util.ArrayList;
import java.util.Arrays;

public class list4 {

	public static void main(String[] args) {
	String s[]= {"dog","cat","fish"};
	for(Object word:s) {
		System.out.println(word);
	}
	
	ArrayList ar=new ArrayList(Arrays.asList(s));
System.out.println(ar);
	}

}

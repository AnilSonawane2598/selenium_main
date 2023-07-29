package handleexception;

import java.util.ArrayList;

// xception in thread "main" java.lang.OutOfMemoryError: Java heap space
public class memoryoutofbounderror {

	public static void main(String[] args) {
		String s="anil";
		ArrayList ar=new ArrayList();
		while(true) {
			s=s+"sonawane";
			ar.add(s);
		}
		
	}

}

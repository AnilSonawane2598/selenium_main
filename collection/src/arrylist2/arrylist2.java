package arrylist2;

import java.util.ArrayList;
import java.util.Collections;

public class arrylist2 {

	public static void main(String[] args) {

		ArrayList<String> ar1=new ArrayList<String>();
		ArrayList ar=new ArrayList();

		ar.add('A');
		ar.add('B');
		ar.add('B');
		ar.add('D');
		ar.add('C');
		System.out.println(ar);
		Collections.shuffle(ar);
		System.out.println(ar);
		Collections.sort(ar, Collections.reverseOrder());
		System.out.println(ar);
		System.out.println();
		ar1.addAll(ar);
		System.out.println(ar1);
		
		
	}

}

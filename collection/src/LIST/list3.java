package LIST;

import java.util.ArrayList;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
ArrayList ar=new ArrayList();
ar.add('a');
ar.add('b');
ar.add('c');
ar.add('y');
ar.add('d');


System.out.println(ar);
Collections.sort(ar);
System.out.println(ar);

System.out.println();
Collections.sort(ar, Collections.reverseOrder());
System.out.println(ar);

Collections.shuffle(ar);
System.out.println(ar);



	}

}

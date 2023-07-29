package arryalist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class list1 {

	public static void main(String[] args) {
ArrayList l=new ArrayList();
l.add('A');
l.add('C');
l.add('B');
l.add('D');
l.add('Z');
l.add('M');
System.out.println(l);
System.out.println();
Collections.sort(l);
System.out.println(l);

Collections.shuffle(l);
System.out.println(l);

System.out.println();
Collections.sort(l,Collections.reverseOrder());
System.out.println(l);

Collections.sort(l);
System.out.println(l);

Collections.sort(l, Collections.reverseOrder());
System.out.println(l);
	

}
}

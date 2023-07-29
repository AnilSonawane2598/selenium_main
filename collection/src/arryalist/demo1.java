package arryalist;

import java.util.Collections;
import java.util.HashSet;

public class demo1 {

	public static void main(String[] args) {
			HashSet h=new HashSet();
			h.add('A');
			h.add('B');
			h.add('C');
			h.add('E');
			System.out.println(h);
			HashSet<String> hs=new HashSet<String>();
			hs.addAll(h);
			System.out.println(hs);
			System.out.println(hs.contains('A'));
			hs.retainAll(h);
			System.out.println(hs);
System.out.println(h.isEmpty());

for(Object o:h) {
	System.out.println(o);
}
			
		
	}

}

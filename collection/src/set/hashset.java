package set;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
HashSet h=new HashSet();
HashSet h1=new HashSet();
System.out.println(h.addAll(h1));
h.add("anil");
h.add(100);
h.add('A');
h.add(true);
h.add(true);
h.add(false);
h.add(40.5);
h.add("anil");
System.out.println(h.size());
System.out.println(h.isEmpty());
System.out.println(h.contains("anil"));
System.out.println(h.remove(true));
System.out.println("*********************");
for(Object o:h) {
	System.out.println(o);
}
System.out.println("**************");
	Iterator it=h.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}

}

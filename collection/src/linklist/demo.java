package linklist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class demo {

	public static void main(String[] args) {
LinkedList l=new LinkedList();
l.add("anil");
l.add(10);
l.add('A');
l.add(true);

System.out.println(l);
System.out.println(l.get(0));
System.out.println(l.size());

System.out.println(l.getFirst());
System.out.println(l.getLast());
System.out.println(l.isEmpty());
System.out.println(l.contains("anil"));

System.out.println("***************");
Iterator i=l.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
	}

}

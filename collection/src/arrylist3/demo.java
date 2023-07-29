package arrylist3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class demo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("a");
		al.add("anil");
		al.add('A');
		al.add(10);
		al.add(20.5);
		al.add("anil");
		System.out.println(al);

		al.add(2, "Sonawane");
		System.out.println(al);
		al.set(1, "ramesh");
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains("a"));
		System.out.println(al.get(0));
	//	Collections.sort(al);

		for(Object data:al) {
			System.out.println(data);
			
		}
		System.out.println("**********");
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());	
		}
		System.out.println("**********");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		Collections.shuffle(al);
		System.out.println(al);
	//	al.remove(7);
		System.out.println(al);
//		Collections.sort(al,Collections.reverseOrder());
//		System.out.println(al);
		
		HashSet hs=new HashSet();
		LinkedList ll=new LinkedList();
	
		
	}

}

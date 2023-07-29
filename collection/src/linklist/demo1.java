package linklist;

import java.util.Collections;
import java.util.LinkedList;

public class demo1 {

	public static void main(String[] args) {

		LinkedList l=new LinkedList();
		LinkedList l1=new LinkedList();

		l.add('D');
		l.add('H');
		l.add('A');
		l.add('C');
		l.add('B');
		l.add('E');
		System.out.println(l);
		
		l1.addAll(l);
		System.out.println(l1);
		
		l1.removeAll(l);
		System.out.println(l1);
		
		Collections.shuffle(l);
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println(l);
		
		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);
		
		
	}

}

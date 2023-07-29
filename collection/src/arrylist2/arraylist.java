package arrylist2;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add("anil");
		ar.add(100);
		ar.add('A');
		ar.add(true);
		ar.add(10.5);
		ar.add("anil");
		ar.add(null);
		ar.add(null);
		System.out.println(ar);
		ar.add(0, "sonawane");
		System.out.println(ar);
		System.out.println(ar.size());
		System.out.println(ar.isEmpty());
		System.out.println(ar.get(5));
		ar.set(1, "kiran");
		System.out.println(ar);
		ar.remove(1);
		System.out.println(ar);
		System.out.println(ar.contains(100));
		System.out.println("****************");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("***********");
		for(Object o:ar) {
			System.out.println(o);
		}
		System.out.println("**********");
		Iterator it=ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}

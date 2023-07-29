package arryalist;

import java.util.ArrayList;
import java.util.Iterator;

public class demo {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add("anil");
		ar.add(100);
		ar.add('A');
		ar.add(true);
		ar.add(100);
		ar.add(10.4);
		System.out.println(ar);
		ar.add(2, "sonawane");
		System.out.println(ar);
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		System.out.println(ar.isEmpty());
		ar.contains('A');
		ar.set(2, "bhosale");
		System.out.println(ar);
		System.out.println("****************");
		for(int i=0;i<ar.size();i++)	{
			System.out.println(ar.get(i));
		}
		System.out.println("****************");

		for(Object o:ar) {
			System.out.println(o);
		}
		System.out.println("****************");
		Iterator i=ar.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	
	}

}

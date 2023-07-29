package mapinterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hasmap {

	public static void main(String[] args) {
		HashMap<Integer, String> hp = new HashMap<Integer, String>();
		hp.put(1, "anil");
		hp.put(2, "rahul");
		hp.put(3, "kiran");
		hp.put(4, "akshay");
		hp.put(5, "ramesh");
		hp.put(6, "akash");
		hp.put(7, "ram");
		hp.put(8, "ganesh");

		System.out.println(hp);
		System.out.println(hp.keySet());
		System.out.println(hp.values());
		System.out.println(hp.containsKey(2));
		System.out.println(hp.containsValue("anil"));
		System.out.println(hp.isEmpty());
		System.out.println(hp.get(4));
		System.out.println();

		// for print only keys
		for (Object obj : hp.keySet()) {
			System.out.println(obj);
		}
		// for print only values
		for (Object value : hp.values()) {
			System.out.println(value);
		}
		// for both key and value
		for (Object both : hp.keySet()) {
			System.out.println(both + "= " + hp.get(both));
		}
		System.out.println("******************");

		// using entryset
		for (Map.Entry entry : hp.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		// using Iterator
		System.out.println("*****************");
		Set s = hp.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}

package mapinterface;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class hashtable {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(1, "anil");
		ht.put(2, "rahul");
		ht.put(3, "kiran");
		ht.put(4, "ramesh");
		ht.put(5, "ram");
		ht.put(6, "pravin");
		System.out.println(ht);
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		System.out.println(ht.contains("anil"));
		System.out.println(ht.containsKey(2));
		System.out.println(ht.isEmpty());
		System.out.println(ht.get(1));
		System.out.println(ht.remove(5));
		System.out.println(ht);
		System.out.println();
	
		for(Object obj:ht.keySet()) {
			System.out.println(obj+" "+ht.get(obj));
		}
		
		System.out.println("******************");
		Set s=ht.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		

		
	}

}

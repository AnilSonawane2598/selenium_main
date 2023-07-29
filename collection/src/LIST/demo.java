package LIST;

import java.util.ArrayList;
import java.util.Collections;

public class demo {

	public static void main(String[] args) {
ArrayList ar=new ArrayList();
ar.add("anil");
ar.add(1);
ar.add('A');
ar.add(true);
ar.add(10.5f);
System.out.println(ar);

System.out.println(ar.get(4));
System.out.println(ar.size());
ar.set(2, 'B');
System.out.println(ar);
ar.remove(2);
System.out.println(ar);
ar.add(2, 'B');
System.out.println(ar);
System.out.println(ar.isEmpty());

for(int i=0;i<ar.size();i++) {
	System.out.println(ar.get(i));
}
System.out.println("**********************");
for(Object o:ar) {
	System.out.println(o);
}
System.out.println("****************");
ArrayList a=new ArrayList();
a.addAll(ar);
System.out.println(a);


a.removeAll(ar);
System.out.println(a);

	}

}

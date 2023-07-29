package list;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class arr {

	public static void main(String[] args) {
ArrayList ar=new ArrayList();
ar.add("anil");
ar.add('A');
ar.add(123);
ar.add(20.6f);

System.out.println(ar);

ar.add(1, "sonawane");
System.out.println(ar);

ar.set(0, "kiran");
System.out.println(ar);

ar.remove("kiran");
System.out.println(ar);

System.out.println(ar.size());

System.out.println(ar.get(2));

System.out.println(ar.isEmpty());


System.out.println("read list");
// by using for loop
for(int i=0;i<ar.size();i++) {
	System.out.println(ar.get(i));
}

System.out.println(" by using for each loop");
// by using for each loop
for(Object word:ar) {
	System.out.println(word);
}


	}

}

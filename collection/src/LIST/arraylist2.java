package LIST;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;

public class arraylist2 {

	public static void main(String[] args) {
ArrayList arr=new ArrayList();
arr.add("anil");
arr.add("sonawane");
arr.add(100);
arr.add(100);
arr.add(200);
arr.add(true);
arr.add(false);
arr.add('A');
arr.add(10.5);
arr.add(20.7f);
arr.add(30.5d);
arr.add("anil");

System.out.println(arr);
System.out.println("adaef   "+arr.size());
System.out.println(arr.isEmpty());
System.out.println(arr.get(4));
System.out.println(arr.remove("anil"));
System.out.println(arr);
arr.add(0, "kiran");
System.out.println(arr);
arr.set(1, "bhosale");
System.out.println(arr);
System.out.println("read list");

//by using for loop
for(int i=0;i<arr.size();i++) {
	System.out.println(arr.get(i));
}

System.out.println(" by using for each loop");
//by using for each loop
for(Object word:arr) {
	System.out.println(word);
	}

ArrayList dup =new ArrayList();
dup.addAll(arr);
System.out.println(dup);

dup.removeAll(arr);
System.out.println(dup);

// error in collection
//System.out.println(arr);
//Collections.sort(arr);
//System.out.println(arr);

	}
}

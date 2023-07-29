package LIST;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		//create object of arraylist
ArrayList al= new ArrayList();

// 7. add value
al.add("anil");
al.add(100);
al.add('A');
al.add(true);
al.add(10.6);
al.add(20.5f);
al.add(100);
System.out.println(al);

//1. find specfic index of arraylist /retrive value
System.out.println(al.get(5));

// 2.cheak list emplty or not
System.out.println(al.isEmpty());

//3. find the size of arraylist
System.out.println(al.size());

//4. remove specific index in arraylist
al.remove(1);
System.out.println(al);

//5. replace value in specific index
al.set(4, "sonamwane");
System.out.println(al);

// 6.add value in specific index
al.add(4, "seleniun");
System.out.println(al);

//



	}

}

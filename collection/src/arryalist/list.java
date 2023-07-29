package arryalist;

import java.util.ArrayList;

public class list {

	public static void main(String[] args) {
ArrayList list=new ArrayList();
list.add("anil");
list.add(1234);
list.add(12);
System.out.println(list);
System.out.println("***********");
for(Object o:list) {
	System.out.println(o);
}
System.out.println("**************");
for(int i=0;i<list.size();i++) {
	System.out.println(list.get(i));
}

	}

}

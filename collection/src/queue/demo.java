package queue;

import java.util.PriorityQueue;

public class demo {

	public static void main(String[] args) {
PriorityQueue p=new PriorityQueue();
PriorityQueue p1=new PriorityQueue();

p.add(20);
p.offer(10);
System.out.println(p.size());
System.out.println(p.isEmpty());
System.out.println(p.contains(10));
System.out.println(p.peek());
System.out.println(p.element());//NoSuchElementException
//System.out.println(p1.element()); // NoSuchElementException
System.out.println(p1.peek());// null
//System.out.println(p1.remove());//NoSuchElementException
System.out.println(p1.peek()); // null
System.out.println(p1.poll()); // null
System.out.println(p.poll());
p.poll();
System.out.println(p);
p.add(100);
p.add(200);
//p.element();
System.out.println(p);
for (Object o:p) {
	System.out.println(o);
}

	}

}

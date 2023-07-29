package casting;

import ACCESSMODIFIER.TEST;

public class cas extends TEST{  // use extend to call protected method(outside package)

	public static void main(String[] args) {
int i=123;
System.out.println(i); // implicit casting
float r=i;
System.out.println(r);

double d=456.54d;
int i1=(int) d;
System.out.println(i1); // explicit casting

cas c1=new cas(); // call protected method create object 
c1.m2(); // call method
	}
	

}

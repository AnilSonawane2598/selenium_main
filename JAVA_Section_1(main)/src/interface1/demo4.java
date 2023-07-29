package interface1;

public class demo4 {

	public static void main(String[] args) {
demo3 d3=new demo3();// non static method call from another class
d3.g();
d3.h();
d3.h1();
d3.h2();
d3.y();
d3.y1();
d3.y2();
System.out.println();
//demo d2=new demo2();
demo d1=new demo3(); // method override
d1.h();
d1.h1();
d1.h2();
d1.h4();
d1.h6();
demo.h3();

System.out.println();

demo2 d2=new demo3();  // method override
d2.y();
d2.y1();
d2.y2();
	}

}

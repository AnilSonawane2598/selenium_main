package interfacee;

public class demo3 {

	public static void main(String[] args) {
  demo2 d2=new demo2(); // method overloading
  d2.a();
  d2.a1();
  d2.a2();
  d2.b();
  d2.b1();
  d2.b2();
  demo d=new demo2();// method overriding
  d.a();
  d.a1();
  d.a2();
  demo1 d1=new demo2();
  d1.b();
  d1.b1();
  d1.b2();
	}

}

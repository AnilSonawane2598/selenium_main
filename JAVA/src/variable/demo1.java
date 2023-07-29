package variable;

public class demo1 extends demo{
int a=4000;
protected int g=400;
	public static void main(String[] args) {
demo d=new demo();
demo1 d1=new demo1();
d1.var1();
System.out.println(d.f);
System.out.println(d1.a);
	}
public void var1() {
	System.out.println(a);
	System.out.println(super.a);
	System.out.println(super.c);
}
}

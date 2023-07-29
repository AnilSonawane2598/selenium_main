package varible;

public class test1 extends test{
int a=100;
	public static void main(String[] args) {
test1 t1=new test1();
t1.m1();
System.out.println();
	}
public void m1() {
	System.out.println(super.a);
	System.out.println(a);
}

}

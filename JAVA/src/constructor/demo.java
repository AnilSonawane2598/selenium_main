package constructor;

public class demo { // with parameter
	int a;
	int b;
public demo(int a1,int b1) {
	a=a1;
	b=b1;
	System.out.println(a+b);
}
	public static void main(String[] args) {
demo d=new demo(10, 20);
	}

}

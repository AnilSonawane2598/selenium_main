package abstraction2;

public class test2 extends test{
	public test2() {
		super(1);
	}

	public static void main(String[] args) {
test2 t2=new test2();
test2 t3=new test2(1,4);


	}
public test2(int r,int e) {
	System.out.println("call");
}
}

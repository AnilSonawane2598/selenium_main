package abstraction2;

public abstract class test {
public test() {
	this(1);
	System.out.println("abstract constructor");
}
public test(int a) {
	System.out.println("single input paramenter");
}
}

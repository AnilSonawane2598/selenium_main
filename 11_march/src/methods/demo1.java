package methods;

public class demo1 { // call non static and static method outside of the class

	public static void main(String[] args) {
demo d=new demo(); // create object to call non static method
d.t(); // non static method calling by obj reff variable name in outside the class
d.t(0);
demo.t2(); // static method calling by class name in outside the class
	}

}

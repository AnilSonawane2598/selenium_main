package TestNg;

import org.testng.annotations.Test;

public class dependsonmethod {
	
	@Test
	public void a() {
		System.out.println("print a");
		int a=10/0;
	}
	@Test(dependsOnMethods="a")
	public void b() {
		System.out.println("print b");
	}

	@Test(dependsOnMethods="a")
	public void c() {
		System.out.println("print c");
	}

	@Test
	public void d() {
		System.out.println("print d");
	}
}

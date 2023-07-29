package TestNg;

import org.testng.annotations.Test;

public class expectesdexception {
	@Test(expectedExceptions=Exception.class)
	public void a() {
		System.out.println("test a");
		int a=10/0;
	}
	@Test
	public void b() {
		System.out.println("test b");
	}
}

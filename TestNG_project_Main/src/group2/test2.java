package group2;

import org.testng.annotations.Test;

public class test2 {
	@Test(groups="sanity")
	public void d() {
		System.out.println("D");
	}

	@Test(groups="smoke")
	public void e() {
		System.out.println("E");
	}

	@Test(groups="regression")
	public void f() {
		System.out.println("F");
	}

}

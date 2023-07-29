package group2;

import org.testng.annotations.Test;

public class test3 {
	@Test(groups="smoke")
	public void g() {
		System.out.println("G");
	}

	@Test(groups="regression")
	public void h() {
		System.out.println("H");
	}

	@Test(groups="sanity")
	public void i() {
		System.out.println("I");
	}

}

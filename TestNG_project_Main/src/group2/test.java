package group2;

import org.testng.annotations.Test;

public class test {
	@Test(groups="regression")
	public void a() {
		System.out.println("A");
	}

	@Test(groups="sanity")
	public void b() {
		System.out.println("b");
	}

	@Test(groups="smoke")
	public void c() {
		System.out.println("C");
	}

}

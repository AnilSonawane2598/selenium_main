package dependonmethod;

import org.testng.annotations.Test;

public class demo {

	@Test(enabled=false)
	public void a() {
		System.out.println("a");

	}

	@Test(dependsOnMethods = "a")
	public void b() {
		System.out.println("b");
	}

	@Test
	public void c() {
		System.out.println("c");
	}
}

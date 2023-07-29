package groups;

import org.testng.annotations.Test;

public class demo2 {
	@Test(groups=" unit",priority=0)
	public void a() {
		System.out.println("a");
	
	}

	@Test(groups="black",priority=2)
	public void b() {
		System.out.println("b");
	}

	@Test(groups=" unit",priority=3,invocationCount=4)
	public void c() {
		System.out.println("c");
	}
}

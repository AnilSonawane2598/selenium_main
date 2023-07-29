package groups;

import org.testng.annotations.Test;

public class demo {
	@Test(groups=" unit",priority=3)
	public void e() {
		System.out.println("E");
	}

	@Test(groups="black",priority=-3,enabled=true)
	public void f() {
		System.out.println("f");
	}

	@Test(groups="black",expectedExceptions=Exception.class)
	public void g() {
		System.out.println("this G method has exception ");
		int a=10/0;
	}
}

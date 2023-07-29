package groups_keyword;

import org.testng.annotations.Test;

public class demo1 {
	@Test(groups="result")
	public void a() {
		System.out.println("print a");
	}
	@Test(groups="test")
	public void b() {
		System.out.println("print b");
	}
	@Test(groups="test")
	public void c() {
		System.out.println("print c");
	}
}

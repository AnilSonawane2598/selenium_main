package groups_keyword;

import org.testng.annotations.Test;

public class demo3 {
	@Test(groups="result")
	public void x() {
		System.out.println("print x");
	}
	@Test(groups="result")
	public void y() {
		System.out.println("print y");
	}
	@Test(groups="test")
	public void z() {
		System.out.println("print z");
	}
}

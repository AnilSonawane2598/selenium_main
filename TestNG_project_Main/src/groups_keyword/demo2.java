package groups_keyword;

import org.testng.annotations.Test;

public class demo2 {
	@Test
	public void o() {
		System.out.println("print o");
	}
	@Test(groups="result")
	public void p() {
		System.out.println("print p");
	}
	@Test(groups="test")
	public void q() {
		System.out.println("print q");
	}
}

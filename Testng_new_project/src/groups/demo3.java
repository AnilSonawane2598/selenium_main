package groups;

import org.testng.annotations.Test;

public class demo3 {
	@Test(groups=" unit")
	public void x() {
		System.out.println("x");
	}

	@Test(groups=" unit",enabled=false)
	public void y() {
		System.out.println("y");
	}

	@Test(groups="black")
	public void z() {
		System.out.println("z");
	}
}

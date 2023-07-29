package timeout;

import org.testng.annotations.Test;

public class demo {

	// timeout keyword
	@Test(timeOut = 2000)
	public void a() {
		for (;;) {
			System.out.println("hi");
		}
	}
}

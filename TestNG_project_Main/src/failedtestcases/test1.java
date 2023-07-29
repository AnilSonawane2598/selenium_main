package failedtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void demo1() {
		System.out.println("print demo1");
		Assert.assertTrue(false); // false
	}

	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void demo2() {
		System.out.println("print demo2");
		Assert.assertTrue(true);

	}

	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void demo3() {
		System.out.println("print demo3");
		Assert.assertTrue(true);

	}

	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void demo4() {
		System.out.println("print demo4");
		Assert.assertTrue(false); // false
	}
}

package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassertion {
	@Test
	public void start()	{
		System.out.println("a");
		System.out.println("b");
		Assert.assertEquals(false, false);
		Assert.assertEquals(false, true);
		System.out.println("c");
		Assert.assertTrue(true);
		System.out.println("d");
	}
	@Test
	public void start1()	{
		System.out.println("a1");
		System.out.println("b1");
		Assert.assertEquals(false, false);
	//	Assert.assertEquals(false, true);
		System.out.println("c1");
		Assert.assertTrue(true);
		System.out.println("d1");
	}

}

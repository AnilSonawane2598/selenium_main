package assertions;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft {
	@Test
	public void test() {
		SoftAssert soft = new SoftAssert();
		System.out.println("a");
		System.out.println("b");
		soft.assertEquals(true, false);
		System.out.println("c");
		System.out.println("d");
		 soft.assertAll();

	}

	@Test
	public void test1() {
		System.out.println("o");
		System.out.println("p");
		System.out.println("q");
		System.out.println("r");

	}
}

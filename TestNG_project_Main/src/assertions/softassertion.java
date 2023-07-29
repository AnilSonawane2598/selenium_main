package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertion {
	@Test
public void name()	{
		SoftAssert sa=new SoftAssert();
	System.out.println("a");
	System.out.println("b");
	sa.assertEquals(true, false);
	System.out.println("c");
	System.out.println("d");
	System.out.println("e");
	sa.assertAll();

}
}

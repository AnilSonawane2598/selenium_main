package invocationcount;

import org.testng.annotations.Test;

public class demo {
	
	@Test(invocationCount=5)
	public void loop()	{
		System.out.println("hi");
	}
}

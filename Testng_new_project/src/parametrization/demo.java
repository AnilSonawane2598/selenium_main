package parametrization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo {

	@Parameters({"a","b"})
	@Test
	public void sum(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	@Parameters({"a","b"})
	@Test
	public void div(int a,int b) {
		int c=a/b;
		System.out.println(c);
	}

}

package testclass_package;

import java.io.IOException;

import org.testng.annotations.Test;

import baseclass_packakge.base_class;
import pageclass_package.broken_links;

public class briken_links extends base_class {

	@Test
	public void brokelink() throws IOException {
		broken_links bk = new broken_links(driver);
		bk.links();
	}
}

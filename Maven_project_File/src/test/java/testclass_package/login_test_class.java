package testclass_package;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_packakge.base_class;
import pageclass_package.login_class;
import utilities_package.RetryAnalyzer;

public class login_test_class extends base_class {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void login() throws InterruptedException {
		login_class lc = new login_class(driver);
		lc.username1(user);
		logger.info("enter username");
		lc.password1(pass);
		logger.info("enter password");
		lc.loginbutton();
		logger.info("click on login button");

		String title = driver.getTitle();
		String act_title = "Swag Labs";
		System.out.println(title);
		if (act_title.equals(title)) {
			Assert.assertTrue(true);
			logger.info("Right title");
			System.out.println("corect title");
		} else {
			Assert.assertTrue(false);
			System.out.println("wrong title");

		}
	}
}

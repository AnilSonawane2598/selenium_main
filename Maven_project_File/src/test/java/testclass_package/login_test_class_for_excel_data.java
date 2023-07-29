package testclass_package;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclass_packakge.base_class;
import pageclass_package.login_class;
import utilities_package.RetryAnalyzer;
import utilities_package.exceldatautil;

public class login_test_class_for_excel_data extends base_class {

	@Test(dataProvider = "logindata", retryAnalyzer = RetryAnalyzer.class)
	public void login(String u, String p, String expected) throws InterruptedException {
		login_class lc = new login_class(driver);
		lc.username1(u);
		logger.info("enter username");
		lc.password1(p);
		logger.info("enter password");
		lc.loginbutton();
		logger.info("click on login button");

		String title = driver.getTitle();
		System.out.println(title);
		String act_title = "Swag Labs";
		if (expected.equals("valid")) {
			if (act_title.equals(title)) {
				Assert.assertTrue(true);
				logger.info("Right title");
				System.out.println("corect title");
			} else {
				Assert.assertTrue(false);
				System.out.println("wrong title");
			}
		} else if (expected.equals("invalid")) {
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

	@DataProvider(name = "logindata")
	public String[][] exceldata() throws IOException {
		String path = "C:\\Users\\DELL\\eclipse-workspace\\Maven_project_File\\src\\main\\java\\testdata_package\\loginmultipledata.xlsx";
		int rownum = exceldatautil.getrowcount(path, "Sheet1");
		int colnum = exceldatautil.getcellcount(path, "Sheet1", 1);

		String logindata[][] = new String[rownum][colnum];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colnum; j++) {
				logindata[i - 1][j] = exceldatautil.getcelldata(path, "Sheet1", i, j);
			}
		}
		return logindata;

	}
}

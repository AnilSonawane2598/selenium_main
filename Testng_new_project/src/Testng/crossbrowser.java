package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class crossbrowser {
	WebDriver driver;
//	@Test(enabled=false)
//public void open() {
//	System.setProperty("WebDriver.firefox.driver",
//			"\"D:\\INSTALLER FILE\\geckodriver-v0.33.0-win32\\firefoxdriver.exe\"");
//	driver = new FirefoxDriver();
//	driver.get("https//:www.google.com");
//	
//}
	@Test
	public void open1() {
		System.setProperty("WebDriver.Ie.driver",
				"\"D:\\INSTALLER FILE\\IEDriverServer_Win32_4.10.0\\IEDriverServer.exe\"");
		driver = new InternetExplorerDriver();
		driver.get("https//:www.google.com");
		
	}
}

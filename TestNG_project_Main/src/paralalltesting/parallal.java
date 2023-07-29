package paralalltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallal {
	WebDriver driver;

	@Parameters("url1")
	@Test
	public void facebook(String url1) {
		System.setProperty("WebDriver.chrome.driver", 
				"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url1);
		driver.manage().window().maximize();
	}

	@Parameters("url2")
	@Test
	public void youtube(String url2) {
		System.setProperty("WebDriver.chrome.driver", 
				"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url2);
		driver.manage().window().maximize();
	}
}

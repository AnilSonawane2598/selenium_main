package Crossbrowsertesting;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test {
	WebDriver driver;	

	// pending not working on firefox and ie
	@Parameters("browser")
	@Test
	public void openvrowser(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("WebDriver.chrome.driver",
					"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		// not working
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("WebDriver.gecko.driver",
					"\"C:\\Users\\DELL\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe\"");
			driver = new FirefoxDriver();
			
		}
		else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("Webdriver.edge.driver",
					"\"D:\\INSTALLER FILE\\edgedriver_win64\\msedgedriver.exe\"");
			driver = new EdgeDriver();
		}
		// not working
		else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("Webdriver.IE.driver",
					"\"C:\\Users\\DELL\\Downloads\\IEDriverServer_x64_4.10.0\\IEDriverServer.exe\"");
			driver = new InternetExplorerDriver();
		}

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}
}

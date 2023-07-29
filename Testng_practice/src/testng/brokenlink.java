package testng;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class brokenlink {
	WebDriver driver;

	@Parameters("url")
	@BeforeClass
	public void openurl(String url) {
		System.setProperty("WebDriver.chrome.driver", "D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(enabled = true)
	public void loginpage() throws InterruptedException, IOException {
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		int count = 0;
		for (WebElement file : list) {
			System.out.println(file.getText());
			String data = file.getAttribute("href");
			if (data == null || data.isEmpty()) {
				System.out.println("link is empty or null");
			}
			URL url = new URL(data);
			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			http.connect();
			if (http.getResponseCode() >= 400) {
				System.out.println(http.getResponseCode() + "= " + data + "==> link is broken");
				count++;
			} else {
				System.out.println(http.getResponseCode() + "= " + data + "==> link is valid");
			}
		}
		System.out.println("total broken link-->" + count);

	}

	@AfterClass
	public void end() {
	driver.quit();
	}

}

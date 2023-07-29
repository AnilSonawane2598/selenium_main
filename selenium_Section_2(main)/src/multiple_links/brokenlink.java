package multiple_links;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlink {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webDriver.crome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		driver.manage().window().minimize();
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		System.out.println();
		int brokenlink = 0;
		for (WebElement ele : list) {
			String data = ele.getAttribute("href");
			if (data == null || data.isEmpty()) {
				System.out.println("link is empty or null");
			}
			URL link = new URL(data);

			HttpsURLConnection httpcode = (HttpsURLConnection) link.openConnection();
			httpcode.connect();
			if (httpcode.getResponseCode() >= 400) {
				System.out.println(httpcode.getResponseCode() + "-->" + data + "broken link");
				brokenlink++;
			} else {
				System.out.println(httpcode.getResponseCode() + "-->" + data + "valid link");
			}
		}
		System.out.println("total broken link" + brokenlink);
	}

}

package multiplelink;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws IOException {
		System.setProperty("WebDriver.chrome.Driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		int count = 0;
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		System.out.println(ele.size());

		for (WebElement data : ele) {
			System.out.println(data.getText());
			String file = data.getAttribute("href");
			if (file == null || file.isEmpty()) {
				System.out.println("link empty or null");
			}
			URL url = new URL(file);
			HttpsURLConnection http = (HttpsURLConnection) url.openConnection();
			http.connect();
			if (http.getResponseCode() > 400) {
				System.out.println(http.getResponseCode() + " " + file + " broken link");
				count++;
			} else {
				System.out.println(http.getResponseCode() + " " + file + "valid link ");
			}

		}
		System.out.println("total broken link-->" + count);
	}

}

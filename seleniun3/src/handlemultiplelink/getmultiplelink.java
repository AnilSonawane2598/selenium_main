package handlemultiplelink;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmultiplelink {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myvi.in/");
		driver.manage().window().minimize();
	
		List<WebElement> ele=driver.findElements(By.tagName("a"));
		System.out.println(ele.size());
		int count=0;
		
		for(WebElement s:ele) {
			System.out.println(s.getText());
			String data=s.getAttribute("href");
			if(data==null||data.isEmpty()) {
				System.out.println("link is null or empty");
			}
			URL url=new URL(data);
			HttpsURLConnection http=(HttpsURLConnection) url.openConnection();
			http.connect();
			if(http.getResponseCode()>=400) {
				System.out.println(http.getResponseCode()+" "+data+"broken likk");
				count++;
			}
			else {
				System.out.println(http.getResponseCode()+" "+data+"valid link");
			}
			System.out.println(count);
		
		
		}
		
	
	
	}

}

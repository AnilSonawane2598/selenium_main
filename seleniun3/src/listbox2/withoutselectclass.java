package listbox2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutselectclass {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(4000);

		String s = "//select[@name=\"birthday_day\"]//option";
		String s1 = "16";

		handlelist(s, s1);

	}

	public static void handlelist(String str, String ele) {
		List<WebElement> list = driver.findElements(By.xpath(str));
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			String data = list.get(i).getText();
			System.out.println(data);
			{
				if (list.get(i).getText().equals(ele))
					list.get(i).click();
			}
		}
	}

}

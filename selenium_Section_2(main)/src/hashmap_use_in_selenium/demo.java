package hashmap_use_in_selenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String name=demo.data().get("C");
		String s[]=name.split(":");

		driver.findElement(By.name("email")).sendKeys(s[0]);
		driver.findElement(By.id("pass")).sendKeys(s[1]);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
		driver.quit();
	}

	public static HashMap<String, String> data() {

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("A", "anil:anil123");
		hm.put("B", "anil:anil1235");
		hm.put("C", "anil123:anil123");
		hm.put("D", "anil123:anil1234");

		return hm;
	}

}

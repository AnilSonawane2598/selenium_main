package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("marvel studio");
	   driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}

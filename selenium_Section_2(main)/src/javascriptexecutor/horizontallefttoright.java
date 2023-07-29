package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class horizontallefttoright {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		// scroll left to right
		js.executeScript("widow.scrollby(500,0)", "");
		
		// scroll right to left
		js.executeScript("widow.scrollby(-200,0)", "");

		Thread.sleep(3000);
		
		
	}

}

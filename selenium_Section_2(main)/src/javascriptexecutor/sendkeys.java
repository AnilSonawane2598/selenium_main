package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("pass"));
		WebElement web=driver.findElement(By.xpath("//button[@value=\"1\"]"));
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		
		js.executeScript("arguments[0].value='"+"anil"+"';", user);
		Thread.sleep(3000);
		js.executeScript("arguments[0].value='"+"anil123"+"';", pass);
		js.executeScript("arguments[0].click()", web);
	}

}

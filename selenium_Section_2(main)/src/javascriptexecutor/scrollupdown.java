package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		JavascriptExecutor js=(JavascriptExecutor) driver;
		// scroll till bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
		Thread.sleep(3000);
		//scroll till top
		js.executeScript("document.documentElement.scrollTop=0", "");
	
		Thread.sleep(3000);
		//scroll till element
	WebElement ele=	driver.findElement(By.xpath("//a[text()='Watch']"));
	js.executeScript("arguments[0].scrollIntoView();", ele);
	}

}

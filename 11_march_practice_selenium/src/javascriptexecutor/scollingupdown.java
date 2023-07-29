package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scollingupdown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	// scroll top to bottom step by step
	js.executeScript("window.scrollBy(0,100)", "");
	Thread.sleep(3000);
	
	// scroll till bottom end directly
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	Thread.sleep(3000);
	
	// scroll bottom to top step by step
	js.executeScript("window.scrollBy(0,-500)", "");
	Thread.sleep(3000);
	
	//scroll till element
	WebElement ele=driver.findElement(By.xpath("(//img[@data-image-index=\"-1\"])[1]"));
	js.executeScript("arguments[0].scrollIntoView();", ele);
	
	//scroll till top
	js.executeScript("document.documentElement.scrollTop=0", "");
		
	}

}

package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlightborder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	WebElement h=driver.findElement(By.xpath("//a[@rel=\"async\"]"));
//	WebElement i=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement i=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));

	js.executeScript("arguments[0].style.border='5px solid red'", i);
	js.executeScript("arguments[0].style.border='5px solid green'", h);


	}



}

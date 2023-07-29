package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlightborderusingmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	WebElement h=	driver.findElement(By.xpath("//a[@rel=\"async\"]"));
	WebElement i=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
	a(driver,h);
	a(driver,i);

	}
public static void a(WebDriver driver,WebElement ele) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].style.border='5px solid red'", ele);
	js.executeScript("arguments[0].style.background='brown'", ele);

}
}

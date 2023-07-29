package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement ele=driver.findElement(By.xpath("//input[@spellcheck=\"false\"]"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].value='"+"mobile"+"';", ele);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	
		
	}

}

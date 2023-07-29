package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class createalertmsg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jio.com/selfcare/recharge/mobility/?entrysource=Mobilepage%20header");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("submitNumber"));
	//	WebElement web=driver.findElement(By.xpath("//button[@value=\"1\"]"));
		Thread.sleep(3000);
		String massage="wrong number";
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+"885067554"+"';", user);
		js.executeScript("alert('"+massage+"')" );
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
			}

}

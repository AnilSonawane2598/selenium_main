package syncronization_waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class both {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jio.com/selfcare/recharge/mobility/?entrysource=Mobilepage%20header");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement ele=	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(null)));
	ele.click();
	ele.sendKeys("Add");
	
	
	
	}
	

}

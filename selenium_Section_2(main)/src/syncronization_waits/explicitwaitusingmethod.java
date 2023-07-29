package syncronization_waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwaitusingmethod {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webDriver.crome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		 driver=new ChromeDriver();
		driver.get("https://www.jio.com/");
		driver.manage().window().minimize();
		By input=By.xpath("(//div[text()='Recharge'])[5]");
		a(driver, input, 10).click();
		driver.close();
		
		
	}
public static WebElement a(WebDriver driver, By ele,int timeout) {
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ele));
	return driver.findElement(ele);
	
}
}

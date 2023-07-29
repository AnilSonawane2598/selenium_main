package exception;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staleelement {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("(//a[@data-csa-c-type=\"link\"])[3]"));
		ele.click();
		driver.navigate().back();
		try {
			ele.click();
		} catch (StaleElementReferenceException r) {
			WebElement ele1 = driver.findElement(By.xpath("(//a[@data-csa-c-type=\"link\"])[3]"));
			ele1.click();
//			r.getMessage();
//			r.printStackTrace();
		} finally {
			System.out.println("wrong input");
		}
	}
}

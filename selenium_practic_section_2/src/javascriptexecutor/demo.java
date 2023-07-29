package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// scroll perticular
		// js.executeScript("window.scrollBy(0,100)", "");
		// Thread.sleep(3000);

		// scroll till bottom
		// js.executeScript("window.scrollBy(0,document.body.scrollHeight)", args);
		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.xpath("//a[text()='Games']"));
		js.executeScript("arguments[0].scrollIntoView()", ele);

		js.executeScript("window.scrollBy(0,-200)", "");

		WebElement ele1 = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value='" + "anil" + "';", ele1);

		WebElement ele2 = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		js.executeScript("arguments[0].click();", ele2);
		
		// for alert massage creation
	WebElement ele3=	driver.findElement(By.xpath("//input[@autocomplete=\"username\"]"));
		String massage="incorect mail";
		js.executeScript("alert('"+massage+"')", ele3);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.quit();
		
	}

}

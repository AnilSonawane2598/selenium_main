package WebElimwntsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

WebElement web=driver.findElement(By.id("email"));
web.sendKeys("anil");
Thread.sleep(4000);
web.clear();
driver.findElement(By.name("email"));
web.sendKeys("rahul");

driver.findElement(By.linkText("Log in")).click();
driver.findElement(By.partialLinkText("Forgotten")).click();
		
		Thread.sleep(4000);
		driver.quit();
		
	}

}

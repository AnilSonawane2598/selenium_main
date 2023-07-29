package WebElimwntsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.healthkart.com/");
		driver.manage().window().maximize();
WebElement web=driver.findElement(By.xpath("//input[@id=\"searchInput\"]"));
		web.sendKeys("big muscle");
		Thread.sleep(4000);
		driver.close();
	}

}

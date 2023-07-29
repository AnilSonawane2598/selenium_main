package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		//step3
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("kolhapur");
//driver.findElement(By.xpath(null)).click();
		Thread.sleep(5000);
		driver.quit();
	}

}

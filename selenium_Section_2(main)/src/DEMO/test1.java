package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.airtel.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[text()=\"for my business\"]")).click();
Thread.sleep(4000);
driver.quit();
	
	
	}

}

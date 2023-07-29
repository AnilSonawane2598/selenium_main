package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mahresult.nic.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()=\"HSC Examination February- 2023 RESULT\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name=\"regno\"]")).sendKeys("R165435");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name=\"mname\"]")).sendKeys("MANGAL");
		Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	Thread.sleep(20000);
	driver.close();
	}

}

package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class fb {
	WebDriver driver;

	@BeforeClass
	public void login() {
		System.setProperty("WebDriver.chrome.driver", "D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void enterlogindetails() {
		// for user input
		WebElement userinput = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		userinput.sendKeys("anil");

		// for password
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.sendKeys("1234");

		// click on login button
		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();

	}

	@AfterClass
	public void end() {

		driver.close();
	}
}

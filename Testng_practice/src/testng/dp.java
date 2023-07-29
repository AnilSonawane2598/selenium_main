package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dp {
	WebDriver driver;

	@BeforeClass
	public void openpage() {
		System.setProperty("WebDriver.chrome.driver", "D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider = "datapass")
	public void page(String data1, String data2, String ele) {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(data1);

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(data2);

		WebElement login = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		login.click();
		
	
	}

	@AfterClass
	public void end() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@DataProvider(name = "datapass")
	public String[][] datapass() {
		String userdata[][] = { { "admin@yourstore.com", "admin", "valid" },
				{ "admin@yourstore.com34", "admin", "invalid" }, { "admin@yourstore.com", "admin123", "invalid" },
				{ "admin@yourstore.com23", "admin345", "invalid" }, { "", "admin", "invalid" } };

		return userdata;
	}
}

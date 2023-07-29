package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class prioritytest {
	WebDriver driver;

	// Alphabetical Priority
	
	@BeforeClass
	public void setup() {
		System.setProperty("WebDriver.chrome.driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}
	@Test
	public void open()	{
		String text=driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		System.out.println(text);
	}
	@Test
	public void verifytext() {
	Boolean b=	driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).isDisplayed();
	System.out.println(b);
	}
	@AfterClass
	public void close() throws InterruptedException	{
		Thread.sleep(3000);
		driver.close();
	}

}

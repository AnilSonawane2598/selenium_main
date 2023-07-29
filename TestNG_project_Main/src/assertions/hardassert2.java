package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class hardassert2 {
	WebDriver driver;
	
	@BeforeClass
	public void login() {
		System.setProperty("WebDriver.chrome.driver","\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void logindetails() {
	boolean img=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]")).isDisplayed();
//	Assert.assertEquals(img, false);
	Assert.assertEquals(img, true);
	System.out.println("hi");
	}
	@AfterClass
	public void end()	{
		driver.close();
	}
		
}

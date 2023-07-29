package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		Thread.sleep(3000);
	//	driver.switchTo().frame(1);
	WebElement web=	driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
	driver.switchTo().frame(web);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("sonawane");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}

}

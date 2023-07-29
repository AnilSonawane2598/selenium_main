package iframe2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[2]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("anil");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'WebTable')]")).click();
	}

}

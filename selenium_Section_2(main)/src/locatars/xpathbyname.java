package locatars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
WebDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.name("email")).sendKeys("anil");
 driver.findElement(By.name("pass")).sendKeys("1234");
 driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
 Thread.sleep(4000);
 driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
Thread.sleep(4000);
driver.close();
	}

}

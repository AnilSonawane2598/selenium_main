package locatars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyindex {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[4]")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}

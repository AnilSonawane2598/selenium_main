package locatars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyclassname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver= new ChromeDriver();
		driver.get("https://nutrabay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("nav-top-link")).click();
		Thread.sleep(4000);
		driver.close();
	}

}

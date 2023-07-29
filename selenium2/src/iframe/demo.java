package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.switchTo().frame("frame1");
		Thread.sleep(4000);

	String s=	driver.findElement(By.xpath("//h1[contains(text(),'This is a sample page')]")).getText();
	System.out.println(s);
	
	}

}

package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendivision {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	//	driver.switchTo().alert();
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	}

}

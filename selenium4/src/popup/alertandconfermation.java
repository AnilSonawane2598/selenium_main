package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alertandconfermation {
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		Alert al=driver.switchTo().alert();
		al.accept();
		al.sendKeys("hi");
		al.dismiss();
		al.getText();
		
		
		// for next new browser window
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child=driver.getWindowHandles();
		System.out.println(child);
		
		for(String data:child) {
			if(!parent.equalsIgnoreCase(data))
				driver.switchTo().window(data);
			System.out.println(driver.getTitle());
			driver.close();
		}
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
	}

}

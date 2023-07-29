package popup;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindow {
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		
		// for multiple window
		
		
		Set<String> window=driver.getWindowHandles();
		System.out.println(window);
		
		Iterator<String> it=window.iterator();
		String parent =it.next();
		System.out.println(parent);
		String child =it.next();
		System.out.println(child);
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
		
	}

}

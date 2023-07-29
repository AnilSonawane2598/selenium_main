package All_selenium_class;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindowpopup {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_project_practice\\src\\test\\resources\\drivers\\chromedriver_win32 (1)");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[normalize-space()='Open Seperate Multiple Windows']")).click();
		driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
		Set<String> window = driver.getWindowHandles();

		Iterator<String> it = window.iterator();
		String parent = it.next();
		System.out.println(parent);
		String child = it.next();
		System.out.println(child);

		driver.switchTo().window(child);
		String title = driver.getTitle();
		System.out.println(title);

		driver.switchTo().window(parent);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
	}

}

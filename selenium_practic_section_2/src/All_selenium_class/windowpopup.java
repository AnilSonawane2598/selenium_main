package All_selenium_class;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowpopup {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_project_practice\\src\\test\\resources\\drivers\\chromedriver_win32 (1)");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		String parent = driver.getWindowHandle();
		System.out.println(parent);

		Set<String> child = driver.getWindowHandles();
		System.out.println(child);

		for (String obj : child) {
			if (obj.equalsIgnoreCase(parent)) {
				driver.switchTo().window(obj);
				String title = driver.getTitle();
				System.out.println(title);
			} else {
				driver.switchTo().window(parent);
				String t = driver.getTitle();
				System.out.println(t);
			}
		}
		driver.quit();

	}

}

package All_selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_project_practice\\src\\test\\resources\\drivers\\chromedriver_win32 (1)");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(0);
		WebElement a = driver.findElement(By.xpath("//input[@type='text']"));
		a.sendKeys("ANIL SONAWANE");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();

	}

}

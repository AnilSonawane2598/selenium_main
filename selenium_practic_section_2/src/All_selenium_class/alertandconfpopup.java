package All_selenium_class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertandconfpopup {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_project_practice\\src\\test\\resources\\drivers\\chromedriver_win32 (1)");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']"))
				.click();
	//	driver.switchTo().alert().accept();
		Alert al=driver.switchTo().alert();
	//	al.dismiss();
		al.sendKeys("hiall");
		al.accept();

	}

}

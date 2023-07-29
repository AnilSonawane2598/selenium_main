package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class newwindopopup {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.Driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[2]")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		String parent =driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> child =driver.getWindowHandles();
		System.out.println(child);
		
		for(String str:child)
			if(!parent.equalsIgnoreCase(str)) {
				driver.switchTo().window(str);
				System.out.println(driver.getTitle());
				driver.close();
			}
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
	}

}

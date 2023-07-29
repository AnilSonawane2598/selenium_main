package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindowpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		driver.findElement(By.xpath("(//button[text()='click'])")).click();
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> child=driver.getWindowHandles();
		System.out.println(child);
		Thread.sleep(3000);
		for(String windows:child) {
			if(!parent.equalsIgnoreCase(windows))
				driver.switchTo().window(windows);
		}
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		String text=driver.findElement(By.xpath("//a[@class=\"analystic\"]")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		//driver.close();
		driver.quit();

		
	}

}

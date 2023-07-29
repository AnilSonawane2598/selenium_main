package popup;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class multiplewindowpopup {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.Driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[3]")).click();
		driver.findElement(By.xpath("//button[text()='click ']")).click();
		
		Set<String> str=driver.getWindowHandles();
		System.out.println(str.size());
		System.out.println(str);
		
		Iterator<String> it=str.iterator();
		String parent=it.next();
		String child=it.next();
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		// java.net.SocketException: Connection reset
		driver.quit();
		
		
		
		
		
		
	}

}

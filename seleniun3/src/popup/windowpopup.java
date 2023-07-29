package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowpopup {

	public static void main(String[] args) throws InterruptedException {
	//	ChromeOptions option =new ChromeOptions();
	//	option.addArguments("--disable-notifications");
		
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[3]")).click();
		driver.findElement(By.xpath("//button[text()='click ']")).click();
		
		Set<String> window=driver.getWindowHandles();
		System.out.println(window);
		System.out.println(window.size());
		
		Iterator<String> it=window.iterator();
		String parent=it.next();
		String child=it.next();
		
		driver.switchTo().window(child);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		

		
	
	}

}

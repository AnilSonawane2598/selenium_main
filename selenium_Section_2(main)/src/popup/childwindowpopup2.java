package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindowpopup2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class=\"analystic\"]")).click();
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
				
		Set<String> windo=driver.getWindowHandles();
		System.out.println(windo.size());
		Iterator<String> it= windo.iterator();
		
		String parent=it.next();
		String child=it.next();
		
		System.out.println(parent);
		System.out.println(child);
		
		driver.switchTo().window(child);
		String text=driver.findElement(By.xpath("//h1[@class=\"display-1\"]")).getText();
		System.out.println(text);
		Thread.sleep(3000);
	//	driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		driver.quit();

		
	}

}

package popup;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class window2 {

	public static void main(String[] args) throws InterruptedException {
	//	ChromeOptions option =new ChromeOptions();
	//	option.addArguments("--disable-notifications");
		
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[2]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> child=driver.getWindowHandles();
		System.out.println(child);
		
		for(String low:child)
			if(!parent.equalsIgnoreCase(low)) {
		driver.switchTo().window(low);
		String s=driver.getTitle();
		System.out.println(s);
		driver.close();
			}
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		String s1=driver.getTitle();
		System.out.println(s1);
		driver.close();
	
	}

}

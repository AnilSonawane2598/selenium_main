package newfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");


		Thread.sleep(3000);
	driver.findElement(By.id("src")).sendKeys("pune");
	
	
		Thread.sleep(4000);
		List<WebElement> web=driver.findElements(By.xpath("//li[@select-id=\"results[0]\"]"));
		Thread.sleep(4000);
		System.out.println(web.size());
		
		
		
		
		Thread.sleep(4000);
		driver.close();
	}

}

package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WbDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement web=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions act=new Actions(driver);
		act.moveToElement(web).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		driver.findElement(By.name("email")).sendKeys("asonawane206@gmail.com");
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.name("password")).sendKeys("anil123");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(3000);
		driver.close();
	}

}

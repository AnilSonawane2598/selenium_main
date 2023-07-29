package actionclass2;

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
		
	WebElement web=	driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
	
	Actions act=new Actions(driver);
	act.moveToElement(web).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[contains(text(),'Sign in')])[1]")).click();
	}

}

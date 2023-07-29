package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	public static void main(String[] args) {
		System.setProperty("WbDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
WebElement ele=	driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]"));
		
		
	    Actions act=new Actions(driver);
	    act.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();

	
	}

}

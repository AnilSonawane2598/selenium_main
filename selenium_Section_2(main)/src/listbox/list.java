package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class list {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@rel=\"async\"]")).click();
	Thread.sleep(4000);
WebElement web= driver.findElement(By.name("birthday_day"));
 Select s=new Select(web);
 s.selectByVisibleText("3");
 
 WebElement web1=driver.findElement(By.id("month"));
 Select s1=new Select(web1);
 s1.selectByVisibleText("Sep");
 
 WebElement web2=driver.findElement(By.id("year"));
 Select s2=new Select(web2);
 s2.selectByVisibleText("1998");
 
 
 driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
 
 driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
 Thread.sleep(6000);
 driver.close();
 
	}

}

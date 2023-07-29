package list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(6000);
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		Select a=new Select(day);
		Select b=new Select(month);
		Select c=new Select(year);
		
		a.selectByIndex(16);
		b.selectByValue("9");
		c.selectByVisibleText("1990");
		



		
		String s1="1/Oct/2006";
		String s2[]=s1.split("/");
		
		m(day,s2[0]);
		m(month,s2[1]);
		m(year,s2[2]);
		
		Thread.sleep(5000);
		driver.quit();
	}
public static void m(WebElement web,String str) {
	Select s=new Select(web);
	s.selectByVisibleText(str);
}
}

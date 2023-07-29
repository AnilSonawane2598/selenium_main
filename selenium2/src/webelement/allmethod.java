package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class allmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.jio.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@title=\"Need help?\"]")).click();
		driver.findElement(By.xpath("//a[text()='Locate Us']")).click();
		Thread.sleep(4000);
		
		String text=driver.findElement(By.xpath("//a[text()='Apps']")).getText();
		System.out.println(text);
		
		boolean b=driver.findElement(By.xpath("//a[text()='Apps']")).isDisplayed();
		System.out.println(b);
		
		boolean b1=driver.findElement(By.xpath("//a[text()='Apps']")).isEnabled();
		System.out.println(b1);
		
		WebElement web=driver.findElement(By.name("search"));
		//System.out.println(web.isDisplayed());
		Select select1=new Select(web);
		select1.selectByVisibleText("Plans");
	//	driver.findElement(By.id("topnav-search")).sendKeys("Recharge");
		Thread.sleep(4000);
		driver.quit();
	}

}

package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	WebElement web=	driver.findElement(By.id("email"));
	web.sendKeys("anil");
	//Thread.sleep(3000);
	web.clear();
	//Thread.sleep(3000);
	web.sendKeys("rahul");
	
	driver.findElement(By.name("login")).click();
	
	String text=driver.findElement(By.xpath("//div[text()='Log in to Facebook']")).getText();
	System.out.println(text);
	
	String s="Log in to Facebook";
	if(text.equals(s)) {
		System.out.println("correct text");
	}
	else {
		System.out.println("wrong text");
	}
	driver.navigate().back();
	driver.findElement(By.xpath("//a[contains(@rel,\"async\")]")).click();
	Thread.sleep(3000);
	boolean b=driver.findElement(By.xpath("//input[@name=\"sex\"]")).isEnabled();
		System.out.println(b);
		
		driver.findElement(By.xpath("//input[@name=\"sex\"]")).click();
		
		boolean b1=driver.findElement(By.xpath("//input[@name=\"sex\"]")).isSelected();
		System.out.println(b1);
		
		boolean b2=driver.findElement(By.xpath("//input[@name=\"sex\"]")).isDisplayed();
		System.out.println(b2);
		
	}

}

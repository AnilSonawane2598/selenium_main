package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allxpath {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("Webdriver.chrome.driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
	WebDriver driver=new ChromeDriver();
	driver.get("https://nutrabay.com/");
	driver.manage().window().maximize();
	
	//1. by xpath attribute
	driver.findElement(By.xpath("//a[@class=\"nav-top-link nav-top-not-logged-in \"]")).click();
	
	// 2. locators by name
	driver.findElement(By.name("email")).sendKeys("8830263791");
	
	//3. by text
	driver.findElement(By.xpath("//a[text()='Continue']")).click();
	
	//4.locator by className
	//driver.findElement(By.className("form-control")).sendKeys("anilsonaw35@gmail.com");
	
	//5. contains
	// 5.1 contains by text
	driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
	
	// 5.2 contains by attribute
//	driver.findElement(By.xpath("//a[contains(@class,\"nb_help\")]")).click();
	
	// 6.xpath by index
	driver.findElement(By.xpath("(//a[contains(@class,\"nb_help\")])[4]")).click();
	
	// 7. by id
	driver.findElement(By.id("menu-item-7463385")).click();
	
	// 8.linktext
	driver.findElement(By.linkText("Nutrabay Cyclone Shaker 500ml")).click();
	
	// 9.partialy link text
	driver.findElement(By.partialLinkText("Bla")).click();
	
	// 10. tagname
	driver.findElement(By.tagName("input")).click();
	
	// 11. css selector
	//driver.findElement(By.cssSelector("#a")).click();
	Thread.sleep(4000);
	driver.close();
	driver.quit();
	
	}

}

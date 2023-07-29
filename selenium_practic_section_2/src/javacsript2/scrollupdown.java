package javacsript2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupdown {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-100)", "");
		Thread.sleep(4000);
	WebElement ele=	driver.findElement(By.xpath("//div[@class=\"navFooterColHead\"]"));
		js.executeScript("arguments[0].scrollIntoView()", ele);
		
		WebElement text=driver.findElement(By.id("twotabsearchtextbox"));
		js.executeScript("arguments[0].value='"+"mobile"+"';", text);
		
		WebElement almsg=driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\"]"));
		String msg="Open Page!!";
		js.executeScript("alert('"+msg+"');", almsg);
		Thread.sleep(5000);
	Alert alt=	driver.switchTo().alert();
	alt.accept();
	
	
	
	
	}

}

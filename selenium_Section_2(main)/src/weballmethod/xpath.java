package weballmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/"); // get method
		driver.findElement(By.xpath("// input[@aria-required=\"true\"]")).sendKeys("anil");
		driver.findElement(By.xpath("// input[@aria-label=\"Password\"]")).sendKeys("sdf2345");
		driver.findElement(By.xpath("// button[contains(text(),'Show')]")).click();
		//driver.findElement(By.xpath("// button[@class=\"_acan _acap _acas _aj1-\"]")).click();
		driver.findElement(By.xpath("// span[text()='Sign up']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name=\"emailOrPhone\"]")).sendKeys("8830163791");
		
		
		Thread.sleep(5000);
		driver.close(); //
	}
}

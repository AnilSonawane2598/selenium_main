package WebElimwntsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(4000);
//driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("anil");
driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
boolean b =driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
System.out.println(b);

driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();

Thread.sleep(4000);
driver.quit();
	}

}

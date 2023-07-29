package WebElimwntsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselectedmethod1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@rel=\"async\"]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@value=\"1\"]")).click();
	boolean b=driver.findElement(By.xpath("//input[@value=\"1\"]")).isSelected();
	System.out.println(b);
	Thread.sleep(1000);
	driver.close();
	}

}

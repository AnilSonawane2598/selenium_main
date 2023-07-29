package newfile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		// without select class
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		Thread.sleep(3000);
		
		List<WebElement> list=driver.findElements(By.xpath("//select[@name=\"birthday_day\"]//option"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			String s=list.get(i).getText(); //4
			System.out.println(s);{
				//0 1,2,3
				if(s.equals("4"))
					list.get(i).click(); //4.
			}
		}
		
		Thread.sleep(3000);
		driver.quit();	
	}
}

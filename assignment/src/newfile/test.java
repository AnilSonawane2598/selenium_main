package newfile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		Thread.sleep(3000);
		String s="//select[@name=\"birthday_day\"]//option";
		String s1="14";
		
		m(s, s1);
		Thread.sleep(3000);
		driver.quit();

	}
	public static void m(String element, String value) {
		
		List<WebElement> list=driver.findElements(By.xpath(element));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());{
				if(list.get(i).getText().equals(value))
					list.get(i).click();
			}
		}
	}

}

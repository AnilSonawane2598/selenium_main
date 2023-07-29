package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutselectclass2 {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a[rel=\"async\"]")).click();
		Thread.sleep(4000);
		String s="//select[@id=\"day\"]//option";
		String s1="12";
		m(s, s1);
		
	}
public static void m(String str,String str1) {
	
List<WebElement> list=driver.findElements(By.xpath(str));
System.out.println(list.size());

for(int i=0;i<list.size();i++) {
	System.out.println(list.get(i).getText());{
		if(list.get(i).getText().equals(str1))
			list.get(i).click();
	}
	
}
}
}

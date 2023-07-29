package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutselectclass2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
	WebDriver	 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String data="14";
	driver.findElement(By.xpath("//a[contains(@rel,\"async\")]")).click();
	Thread.sleep(3000);
	
	List<WebElement> list=driver.findElements(By.xpath("//select[@id=\"day\"]//option"));
	System.out.println(list.size());
	
	for(int i=0;i<list.size();i++) {
		String s=list.get(i).getText();
		System.out.println(s);{
			if(list.get(i).getText().equals(data))
		//	if(s.equals(data))
				list.get(i).click();
		}
		
	}
	}

}

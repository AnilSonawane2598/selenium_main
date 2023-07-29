package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class withoutselectclass {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//a[contains(@rel,\"async\")]")).click();
	Thread.sleep(3000);
	
//	WebElement day=driver.findElement(By.id("day"));
//	WebElement month=driver.findElement(By.id("month"));
//	WebElement year=driver.findElement(By.id("year"));
//	
//	Select s1=new Select(day);
//	Select s2=new Select(month);
//	Select s3=new Select(year);
	String date="//select[@id=\"day\"]//option";
	String s1="19";
	//String s2[]=s1.split("/");
	m(date,s1);

	
	}

	public static void m(String ele,String str) throws InterruptedException {
		List<WebElement> list=driver.findElements(By.xpath(ele));
		System.out.println(list.size());
		Thread.sleep(3000);
		for(int i=0;i<list.size();i++) {
			String s=list.get(i).getText();
			System.out.println(s);{
				if(list.get(i).getText().equals(str))
					list.get(i).click();
			}
		}
	}

}

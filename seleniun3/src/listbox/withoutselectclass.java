package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutselectclass {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a[rel=\"async\"]")).click();
		Thread.sleep(4000);
		
	String text=driver.findElement(By.xpath("//label[text()='Female']")).getText();
		System.out.println(text);
		
		WebElement web=driver.findElement(By.xpath("//label[text()='Female']"));
		web.click();
		Thread.sleep(4000);
		
		boolean b=driver.findElement(By.xpath("//label[text()='Female']")).isDisplayed();
		System.out.println(b);
		
		String s1="(//select[@title=\"Day\"])[1]//option";
		String e="19";
		m(s1, e);
		Thread.sleep(3000);
		driver.close();
		
	}
public static void m(String a,String b) {
	List<WebElement> list=driver.findElements(By.xpath(a));
	System.out.println(list.size());
	for(int i=0;i<list.size();i++) {
		String s2=list.get(i).getText();
		System.out.println(s2);{
			if(list.get(i).getText().equals(b))
				list.get(i).click();
		}
	}
	
	
}
}

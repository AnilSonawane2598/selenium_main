package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listhandle2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
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
		
		
		List<WebElement> list=driver.findElements(By.xpath("(//select[@id=\"day\"])[1]//option"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			String s=list.get(i).getText();
			System.out.println(s);{
				if(s.contains("10"))
					list.get(i).click();
			}
		}
		Thread.sleep(4000);
		driver.close();
		
	}

}

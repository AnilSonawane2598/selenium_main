package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlelistbox { // with select class

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.name("sex")).click();
//		String s=driver.findElement(By.xpath("(//span[@class=\"_5k_2 _5dba\"])[1]")).getText();
//		System.out.println(s);
//		Thread.sleep(3000);
		
		WebElement day=driver.findElement(By.id("day"));
//		WebElement month=driver.findElement(By.id("month"));
//		WebElement year=driver.findElement(By.id("year"));
		
//		Select s1=new Select(day);
//		Select s2=new Select(month);
//		Select s3=new Select(year);
		
		
//		s1.selectByIndex(2);
//		s2.selectByValue("4");
//		s3.selectByVisibleText("1998");
//		Thread.sleep(4000);

		// handle list box using collection interface
		Select d=new Select(day);
		List<WebElement> l=d.getOptions();
		System.out.println(l.size());// print the size of day list
		Thread.sleep(3000);
		for(int i=0;i<l.size();i++) {
			String str=l.get(i).getText();{
			System.out.println(str);
				if(str.equals("21"));{
				l.get(i).click();	
		}
			}
		}
		
		String date="6";
	//	m(day, date);
		Thread.sleep(4000);
		driver.close();
			
	}
public static void m(WebElement web,String str) {
	Select s2=new Select(web);
	s2.selectByVisibleText(str);
}

}























package listbox;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		demo d=new demo();
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(6000);
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		
		// how to get total no size of list
		Select s=new Select(day);
		List<WebElement> l=s.getOptions();
		System.out.println(l.size());
		
		// how to print all value
		for(int i=0;i<l.size();i++) {
			String s1=l.get(i).getText();
			System.out.println(s1);{
				
			// how to select specific value
			if(s1.equals("12")) {
				l.get(i).click();
			}
			}
	}
		System.out.println("**************************");
		Select months=new Select(month);
		List<WebElement> l1=months.getOptions();
		System.out.println(l1.size());
		
		for(int i=0;i<l1.size();i++) {
			String s2=l1.get(i).getText();
			System.out.println(s2);{
			if(s2.equals("Aug"))
				l1.get(i).click();
		}
		}
		System.out.println("*********************************");
		Select yeer=new Select(year);
		List<WebElement> l2=yeer.getOptions();
		System.out.println(l2.size());
		
		for(int i=0;i<l2.size();i++) {
			String s3=l2.get(i).getText();
			System.out.println(s3);
			if(s3.equals("1990"))
				l2.get(i).click();
		}
		Thread.sleep(3000);
		String s5="11/Oct/1970";
		String s6[]=s5.split("/");
		
		d.m(day, s6[0]);
		d.m(month, s6[1]);
		d.m(year, s6[2]);
		Thread.sleep(3000);
		driver.quit();
	}
	public void m(WebElement web ,String str) {
		Select s4=new Select(web);
		s4.selectByVisibleText(str);
		
	}
}

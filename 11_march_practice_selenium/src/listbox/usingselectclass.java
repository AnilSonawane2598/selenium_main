package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class usingselectclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//a[contains(@rel,\"async\")]")).click();
	Thread.sleep(3000);
	
	WebElement day=driver.findElement(By.id("day"));
	WebElement month=driver.findElement(By.id("month"));
	WebElement year=driver.findElement(By.id("year"));
	
	// using select class
	Select s1=new Select(day);
	Select s2=new Select(month);
	Select s3=new Select(year);
	
//	s1.selectByIndex(5);
//	s2.selectByValue("8");
//	s3.selectByVisibleText("2001");

	// second method using select class
	
	List<WebElement> w1=s1.getOptions();
	System.out.println(w1.size());
	Thread.sleep(3000);
	for(int i=0;i<w1.size();i++) {
		String s4=w1.get(i).getText();
		System.out.println(s4);{
			if(s4.equals("30")) 
				w1.get(i).click();	
		}
	}
	Thread.sleep(4000);
	String date="12/Aug/2004";
	String data[]=date.split("/");
	m(day,data[0]);
	m(month,data[1]);
	m(year,data[2]);
	
	}

	public static void m(WebElement ele,String str) {
		Select s5=new Select(ele);
		s5.selectByVisibleText(str);	
	}

}

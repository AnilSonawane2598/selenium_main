package webelement2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class allmethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	WebElement web=	driver.findElement(By.xpath("//input[@type=\"text\"]"));
	web.sendKeys("anil");
	web.clear();
	web.sendKeys("kiran");
    driver.findElement(By.id("pass")).sendKeys("1234");
	driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
	Thread.sleep(4000);
	String title=driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).getText();
	System.out.println(title);
	String s="Create new account";
	if(s.equals(title)) {
		System.out.println("correct text");
	}
	else {	
		System.out.println("wrong text");
	}
	driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@data-type=\"text\"]")).sendKeys("anil");
	driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
	boolean b=driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
	System.out.println(b);
	WebElement day=driver.findElement(By.id("day"));
	WebElement month=driver.findElement(By.id("month"));
	WebElement year=driver.findElement(By.id("year"));
	
//	Select s1=new Select(day);
//	Select s2=new Select(month);
//	Select s3=new Select(year);
//
//	s1.selectByVisibleText("3");
//	s2.selectByIndex(2);
//	s3.selectByValue("2020");

	String date="12/Sep/2001";
	String q[]=date.split("/");
	
	a(day,q[0]);
	a(month,q[1]);
	a(year,q[2]);

	
	Thread.sleep(4000);
	driver.quit();
	}
public static void a(WebElement we,String str)	{
	Select s4=new Select(we);
	s4.selectByVisibleText(str);
}
}

package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newlist {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("Webdriver.chrome.driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@data-type=\"text\"]")).sendKeys("TRISHA");
	driver.findElement(By.xpath("(//input[@data-type=\"text\"])[2]")).sendKeys("RATHOD");
	driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys("9119594702");

	String text=driver.findElement(By.xpath("//label[text()=\"Female\"]")).getText();
	System.out.println(text);
	
	String text1="Female";
	if(text1.equals(text)) {
		System.out.println("correct text");
	}
	else {
		System.out.println("wrong text");
	}
	
	
	
	WebElement web=driver.findElement(By.xpath("//label[text()=\"Female\"]"));
	web.click();
	System.out.println(web.isDisplayed());
	System.out.println(web.isEnabled());
	
	
	WebElement day=driver.findElement(By.id("day"));
	WebElement month=driver.findElement(By.id("month"));
	WebElement year=driver.findElement(By.id("year"));

	Select s=new Select(day);
	Select s1=new Select(month);
	Select s2=new Select(year);
	
	// 1. select by visible text 
//	s.selectByVisibleText("16");
//	s1.selectByVisibleText("Jun");
//	s2.selectByVisibleText("1998");
//	
	// 2. select by index
//	s.selectByIndex(3);
//	s1.selectByIndex(8);
//	s2.selectByIndex(10);
	
	// 3. select by value
//	s.selectByValue("4");
//	s1.selectByValue("7");
//	s2.selectByValue("1999");
	
	// call through method
	String s3="21/Jan/2005";
	String s4[]=s3.split("/");

	
	calling(day, s4[0]);  // calling the static calling method
	calling(month, s4[1]);
	calling(year, s4[2]);
	Thread.sleep(7000);

	
	driver.findElement(By.id("cookie-use-link")).click();
	
	Thread.sleep(7000);
	driver.quit();

	}
	public static void calling(WebElement web,String str) {
	Select select1 =new Select(web);
	select1.selectByVisibleText(str);
	}		
}

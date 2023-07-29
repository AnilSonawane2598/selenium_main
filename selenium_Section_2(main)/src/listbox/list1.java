package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class list1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[text()='Create new account']")).click();
Thread.sleep(6000);
//driver.findElement(By.id("day")).sendKeys("1");
//driver.findElement(By.id("month")).sendKeys("Feb");
//driver.findElement(By.id("year")).sendKeys("2000");

WebElement day=driver.findElement(By.id("day"));
WebElement month=driver.findElement(By.id("month"));
WebElement year=driver.findElement(By.id("year"));

//Select select1=new Select(day);
//Select select2=new Select(month);
//Select select3=new Select(year);

//select1.selectByVisibleText("1");
//select2.selectByIndex(9);
//select3.selectByValue("2001");

String date="1/Jan/2010";
String date1[]=date.split("/");

h(day, date1[0]);
h(month, date1[1]);
h(year, date1[2]);

Thread.sleep(4000);

driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
boolean b=driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
System.out.println(b);

String s=driver.findElement(By.xpath("//a[text()='Cookies Policy']")).getText();
System.out.println(s);
String s1="Cookies Policy";
if(s1.equals(s)) {
	System.out.println("correct text");
}
else
	System.out.println("wrong text");

String s2=driver.getCurrentUrl();
System.out.println(s2);

boolean b1=driver.findElement(By.xpath("//input[@type=\"radio\"]")).isDisplayed();
System.out.println(b1);




Thread.sleep(3000);
driver.quit();
	}
public static void h(WebElement web, String str) {
	Select select4=new Select(web);
	select4.selectByVisibleText(str);
}
}

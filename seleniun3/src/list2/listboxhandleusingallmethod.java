package list2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxhandleusingallmethod {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
// for day using select class
WebElement web=driver.findElement(By.id("daybox"));
Select s=new Select(web);
s.selectByIndex(2);

// for month using select class + list interface
WebElement web1=driver.findElement(By.xpath("(//select[@type=\"text\"])[4]"));
Select s1=new Select(web1);
List<WebElement> list=s1.getOptions();
System.out.println(list.size());
// to print all month list and select one
for(int i=0;i<list.size();i++) {
	String str=list.get(i).getText();
	System.out.println(str);{
		if(str.equals("June"))
			list.get(i).click();
	}
}
Thread.sleep(4000);
// for year using static m method 
WebElement year=driver.findElement(By.id("yearbox"));
String s3="2002";
m(year, s3);

// without select class 
driver.findElement(By.xpath("//span[@role=\"combobox\"]")).click();
List<WebElement> desh=driver.findElements(By.xpath("//ul[@role=\"tree\"]//li"));
System.out.println(desh.size());
String s6="Denmark";
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
for(int i=0;i<desh.size();i++) {
String s5=desh.get(i).getText();
System.out.println(s5);
	{
	if(s5.equals(s6))
	desh.get(i).click();
	}
}
Thread.sleep(4000);
driver.close();
	}
public static void m(WebElement w,String str1) {
	Select s2=new Select(w);
	s2.selectByVisibleText(str1);
}
}

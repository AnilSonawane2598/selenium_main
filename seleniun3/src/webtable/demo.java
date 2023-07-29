package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
	WebElement ele=	driver.findElement(By.xpath("//p[@class=\"intro\"]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		// find row
	 int a =	driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
	 System.out.println(a);
	 
	 // find column
int b=	 driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
System.out.println(b);

// fetch specific data
String data1=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[4]/td[2]")).getText();
System.out.println(data1+" || ");

// for print all table
for(int i=2;i<=a;i++) {
	for(int j=1;j<=b;j++) {
	String data=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
	System.out.print(data+" || ");
	}
	System.out.println();
}
	
		
	}

}

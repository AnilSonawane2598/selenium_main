package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3school {

	// assignment 6
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']")).click();
		Thread.sleep(3000);
		
		Set<String> windowid=driver.getWindowHandles();
		System.out.println("count of page id is--->"+windowid.size());
		
		Iterator<String> it=windowid.iterator();
		String parent=it.next();
		String child=it.next();
		System.out.println("parent id is-->"+parent);
		System.out.println("child id is-->"+child);
		
	//	System.out.println(driver.getTitle());
		driver.switchTo().window(child);
	//	System.out.println(driver.getTitle());
		
	boolean b=driver.findElement(By.xpath("//i[@class=\"fa fa-logo ws-hover-text-green\"]")).isDisplayed();
	System.out.println("logo-->"+b);	
	
	driver.switchTo().window(parent);
	String button=driver.findElement(By.id("runbtn")).getText();
	System.out.println(button);
	
	Thread.sleep(3000);
	driver.quit();	
	}
}

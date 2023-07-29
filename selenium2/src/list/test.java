package list;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
	List<WebElement> list=driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));
	System.out.println(list.size());
	
	for(WebElement ele:list) {
		System.out.println(ele.getText());				
	}
	Thread.sleep(7000);
	driver.close();
	}
}

package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutselectclass2 {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		 driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	String  skill="(//select[@type=\"text\"])[1]//option";
	
	String s="Analytics";
	sdd(skill, s);
	Thread.sleep(3000);
	driver.quit();
	
	
	}
public static void sdd(String element ,String value) throws InterruptedException {
	List<WebElement> list=driver.findElements(By.xpath(element));
	System.out.println(list);
	System.out.println(list.size());
	Thread.sleep(3000);
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().equals(value)) {
			list.get(i).click();
		}
	}
}
}

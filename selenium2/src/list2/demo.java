package list2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	WebElement web=driver.findElement(By.id("daybox"));
	
	
	Select s=new Select(web);
	
	List<WebElement> l=s.getOptions();
	System.out.println(l.size());
	for(int i=0;i<l.size();i++) {
		String s1=l.get(i).getText();
		System.out.println(s1);{
			if(s1.equals("23"))
				l.get(i).click();
		}
		
	}
	Thread.sleep(3000);
	s.selectByVisibleText("10");
	Thread.sleep(4000);
	driver.close();
	
	}

}

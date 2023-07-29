package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutselectclass {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		 driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		String day="//select[@id=\"daybox\"]//option";
		String month="//select[@ng-model=\"monthbox\"]//option";
		String year="//select[@id=\"yearbox\"]//option";
		
		String s1="12/June/2003";
		String s2[]=s1.split("/");
		
		m(day, s2[0]);
		m(month,s2[1]);
		m(year,s2[2]);
		
		
	}
public static void m(String ele,String str) {
	List<WebElement> web=driver.findElements(By.xpath(ele));
	System.out.println(web.size());
	
	for(int i=0;i<web.size();i++) {
		String data=web.get(i).getText();
		System.out.println(data);{
			if(web.get(i).getText().equals(str))
				web.get(i).click();
		}
	}	
}
}

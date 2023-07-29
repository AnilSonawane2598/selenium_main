package list2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutselectclass2 {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		withoutselectclass2 call =new withoutselectclass2();
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		 driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		String s="(//select[@type=\"text\"])[5]//option";
		String s1="(//select[@type=\"text\"])[4]//option";
		String s2="(//select[@type=\"text\"])[3]//option";
		
		String v="12-August-2001";
		String v1[]=v.split("-");
		
		call.sdd(s, v1[0]);
		call.sdd(s1, v1[1]);
		call.sdd(s2, v1[2]);
		Thread.sleep(3000);
		driver.quit();
		
	}
public void sdd(String ele, String value) throws InterruptedException {
	List<WebElement> web=driver.findElements(By.xpath(ele));
	//System.out.println(web.size());
	Thread.sleep(4000);
	for(int i=0;i<web.size();i++) {
		web.get(i).getText();
			if(web.get(i).getText().equals(value))
				web.get(i).click();
		}
	}

}

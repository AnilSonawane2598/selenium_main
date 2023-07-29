package listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutselectclass {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		 driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	WebElement ele=	driver.findElement(By.name("radiooptions"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		String s="//select[@id=\"daybox\"]//option";
		String s1="(//select[@type=\"text\"])[4]//option";
		String s2="//select[@id=\"yearbox\"]//option";
		String s3="15/March/1980";
		String s4[]=s3.split("/");
		
		a(s,s4[0]);
		a(s1,s4[1]);
		a(s2,s4[2]);

	}
	public static void a(String str,String ele) {
		List<WebElement> list=driver.findElements(By.xpath(str));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equals(ele))
				list.get(i).click();
		}
	}

}

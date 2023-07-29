package listboxhandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class withoutselectclass {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		String s3="14";
		List<WebElement> web=driver.findElements(By.xpath("//select[@id=\"daybox\"]//option"));
		System.out.println(web.size());
		
		for(int i=0;i<web.size();i++) {
			String s1=web.get(i).getText();
			System.out.println(s1);{
				if(web.get(i).getText().equals(s3))
					web.get(i).click();
			}
		}
		
		
	
	}

}

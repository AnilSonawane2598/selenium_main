package multiple_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getalllink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.crome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jio.com/");
		driver.manage().window().minimize();
		Thread.sleep(5000);
	List<WebElement>	list=driver.findElements(By.tagName("a"));
	System.out.println(list.size());
	System.out.println();

	for(WebElement ele:list) {
		System.out.println(ele.getText());
		System.out.println(ele.getAttribute("href"));
	}
	}

}

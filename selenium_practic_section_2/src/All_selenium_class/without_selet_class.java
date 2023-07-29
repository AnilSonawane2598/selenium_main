package All_selenium_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_selet_class {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_project_practice\\src\\test\\resources\\drivers\\chromedriver_win32 (1)");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		String ele = "//select[@type=\"text\"]//option";
		String date = "19-May-1990";
		String day[] = date.split("-");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		listhandle(ele, day[0]);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-100)", "");
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));

		js.executeScript("arguments[0].value='" + "anil" + "';", name);

	}

	public static void listhandle(String str, String s) {
		List<WebElement> list = driver.findElements(By.xpath(str));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getText().equals(s)) {
				list.get(i).click();
			}
		}
	}
}

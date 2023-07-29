package listbox;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class usingselectclass {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.name("radiooptions"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);

		WebElement day = driver.findElement(By.id("daybox"));
		WebElement month = driver.findElement(By.xpath("//select[@ng-model=\"monthbox\"]"));
		WebElement year = driver.findElement(By.id("yearbox"));

		Select s = new Select(day);
		Select s1 = new Select(month);
		Select s2 = new Select(year);

		s.selectByIndex(4);
		s1.selectByValue("May");
		s2.selectByVisibleText("2001");

		// second type
		List<WebElement> list = s.getOptions();
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			String data = list.get(i).getText();
			System.out.println(data);
			{
				if (data.equals("13"))
					list.get(i).click();
			}
		}

		String data1 = "24/February/1990";
		String data2[] = data1.split("/");
		a(day, data2[0]);
		try {
			a(month, data2[1]);
		} catch (NoSuchElementException n) {
			a(month, data2[1]);

		}
		a(year, data2[2]);
		driver.quit();

	}

	public static void a(WebElement ele, String str) {
		Select S4 = new Select(ele);
		S4.selectByVisibleText(str);

	}

}

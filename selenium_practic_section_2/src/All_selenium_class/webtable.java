package All_selenium_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_project_practice\\src\\test\\resources\\drivers\\chromedriver_win32 (1)");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement ele = driver.findElement(By.xpath("//div[@id='belowtopnav']//div[3]//h3[1]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);

		int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		System.out.println("total rows -->" + row);

		int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("total col-->" + col);

		for (int i = 2; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				String data = driver
						.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print(data + " || ");
			}
			System.out.println();
		}
	}

}

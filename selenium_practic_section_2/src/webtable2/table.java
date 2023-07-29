package webtable2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().minimize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement point = driver.findElement(By.xpath("//p[@class=\"intro\"]"));
		js.executeScript("arguments[0].scrollIntoView();", point);

		int row = driver.findElements(By.xpath("//table[@class=\"ws-table-all\"]//tr")).size();
		System.out.println(row);

		int col = driver.findElements(By.xpath("//table[@class=\"ws-table-all\"]//th")).size();
		System.out.println(col);

		String row2 = driver.findElement(By.xpath("//table[@class=\"ws-table-all\"]//tr[2]//td[1]")).getText();
		System.out.println(row2);

		for (int i = 2; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				String data = driver
						.findElement(By.xpath("//table[@class=\"ws-table-all\"]//tr[" + i + "]//td[" + j + "]"))
						.getText();
				System.out.print(data + " || ");
			}
			System.out.println();
		}

	}

}

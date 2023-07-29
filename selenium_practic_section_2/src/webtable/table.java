package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath("//p[@class=\"intro\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);

		int a = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		System.out.println("row-->" + a);

		int b = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("column-->" + b);

		String data1 = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td[1]")).getText();
		System.out.println(data1);
		System.out.println();

		for (int i = 2; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				String data = driver
						.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print(data + "  || ");

			}

			System.out.println();
		}
	}
}

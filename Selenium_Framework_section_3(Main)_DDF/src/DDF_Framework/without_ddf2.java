package DDF_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_ddf2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("WebDriver.chrome.driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String path = "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Framework_section_3(Main)_DDF\\Excel_File\\userdata.xlsx";
		FileInputStream file = new FileInputStream(path);
		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(data);

		FileInputStream file1 = new FileInputStream(path);
		String data1 = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(data1);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		FileInputStream file3 = new FileInputStream(path);
		String data2 = WorkbookFactory.create(file3).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();

		String uname = driver.findElement(By.xpath("//p[text()='Paul Collings']")).getText();

		if (uname.equals(data2)) {
			System.out.println("correct name");
		} else
			System.out.println("wrong name");
		driver.close();

	}

}

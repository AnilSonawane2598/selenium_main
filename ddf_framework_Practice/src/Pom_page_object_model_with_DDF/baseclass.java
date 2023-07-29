package Pom_page_object_model_with_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver;
		System.setProperty("WebDriver.chrome.driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		String data = "C:\\Users\\DELL\\eclipse-workspace\\ddf_framework_Practice\\exceldata\\userdata.xlsx";
		FileInputStream file = new FileInputStream(data);
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		loginpage lp = new loginpage(driver);
		lp.openpage();

		String first = sheet.getRow(1).getCell(0).getStringCellValue();
		lp.email(first);

		String second = sheet.getRow(1).getCell(1).getStringCellValue();
		lp.pass(second);
		lp.click();

		driver.close();
	}
}

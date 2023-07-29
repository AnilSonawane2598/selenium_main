package Manual_prg_ass_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byjus_base_class {
	static WebDriver driver;

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("WebDriver.chrome.driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		FileInputStream file = new FileInputStream(
				"C:\\Users\\DELL\\eclipse-workspace\\Testng_new_project\\Exceldata\\Byjusexceldata.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");

		Byjus_btc_page b = new Byjus_btc_page(driver);
		String url = sheet.getRow(1).getCell(0).getStringCellValue();
		b.openurl(url);
		b.closepopup();
		b.Book_A_Free_Counselling_Session();
		String name1 = sheet.getRow(1).getCell(1).getStringCellValue();
		b.name(name1);
		Thread.sleep(2000);
		double mobile1 = sheet.getRow(1).getCell(2).getNumericCellValue();
		String s=String.valueOf(mobile1);
		b.mobile(s);
		b.send_otp();
		Thread.sleep(20000);
		b.city();
		Thread.sleep(2000);
		b.center();
		Thread.sleep(2000);
		b.select_class();
		Thread.sleep(2000);
		b.submit();
		b.succesfulltext();
		Thread.sleep(2000);
		b.end();

	}

}

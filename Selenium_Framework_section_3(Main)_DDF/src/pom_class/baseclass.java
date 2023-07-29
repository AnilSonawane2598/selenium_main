package pom_class;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("WebDriver.chrome.driver",
				"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String path = "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Framework_section_3(Main)_DDF\\Excel_File\\userdata.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");

		loginpagechildclass lp = new loginpagechildclass(driver);
		lp.enter();
		String input = data.getRow(1).getCell(0).getStringCellValue();
		lp.id(input);
		String input2 = data.getRow(1).getCell(1).getStringCellValue();
		lp.password(input2);
		lp.button();
		
		
		pimchildclass2 pc=new pimchildclass2(driver);
//		String data1="HR Manager";
//		String data2="//div[@role=\"listbox\"]//div";
		pc.pim();
		pc.jobtitle();
		// list box method not working
//		pc.list(data2, data1);
		
	}

}

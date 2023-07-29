package Manual_prg_ass_2;

import java.util.List;

import org.apache.poi.ss.usermodel.RichTextString;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Byjus_btc_page {
	WebDriver driver;

	public Byjus_btc_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[@class=\"close\"])[2]")
	WebElement closepopup;

	@FindBy(xpath = "(//button[@type=\"button\"])[2]")
	WebElement Book_A_Free_Counselling_Session;

	@FindBy(xpath = "(//input[@type=\"text\"])[2]")
	WebElement name;

	@FindBy(xpath = "(//input[@type=\"text\"])[3]")
	WebElement mobile;

	@FindBy(xpath = "//button[contains(text(),'Send OTP')]")
	WebElement send_otp;

	@FindBy(xpath = "//select[@name=\"cityname\"]//option[60]")
	WebElement city;

	@FindBy(xpath = "//select[@name=\"centername\"]//option")
	List<WebElement> center;

	@FindBy(id = "class-five")
	WebElement select_class;

	@FindBy(xpath = "(//button[@type=\"button\"])[5]")
	WebElement submit;

	@FindBy(xpath = "//b[contains(text(),'Thank you for your Interest.')]")
	WebElement succesfulltext;

	public void openurl(String url) {
		driver.get(url);
	}

	public void closepopup() {
		closepopup.click();
	}

	public void Book_A_Free_Counselling_Session() {
		Book_A_Free_Counselling_Session.click();
	}

	public void name(String name1) {
		name.sendKeys(name1);
	}

	public void mobile(String mobile1) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value='" + "8830163791" + "';", mobile);
		mobile.sendKeys(mobile1);
	}

	public void send_otp() {
		send_otp.click();
	}

	public void city() {
		city.click();
	}

	public void center() {
		center.get(2).click();
	}

	public void select_class() {
		select_class.click();
	}

	public void submit() {
		submit.click();
	}

	public void succesfulltext() {
	System.out.println(succesfulltext.getText());
	}

	public void end() {
		driver.quit();
	}
}

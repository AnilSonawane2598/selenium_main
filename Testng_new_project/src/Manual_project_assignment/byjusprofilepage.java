package Manual_project_assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class byjusprofilepage {
	WebDriver driver;

	public byjusprofilepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class=\"input-group\"])[3]")
	WebElement date;

	@FindBy(xpath = "//select[@class=\"react-datepicker__year-select\"]//option[99]")
	WebElement year;

	@FindBy(xpath = "//select[@class=\"react-datepicker__month-select\"]//option[5]")
	WebElement month;

	@FindBy(xpath = "(//div[text()='2'])[1]")
	WebElement day;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement save;

	public void date() {
		date.click();
	}

	public void year() {
		year.click();

	}

	public void month() {
		month.click();

	}

	public void day() {
		day.click();

	}

	public void save() {
		date.click();
	}

}

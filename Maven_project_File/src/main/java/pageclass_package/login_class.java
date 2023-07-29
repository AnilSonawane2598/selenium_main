package pageclass_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_class {
	public static WebDriver driver;

	@SuppressWarnings("static-access")
	public login_class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder=\"Username\"]")
	WebElement username1;

	@FindBy(xpath = "//input[@placeholder=\"Password\"]")
	WebElement password1;

	@FindBy(xpath = "//input[@id=\"login-button\"]")
	WebElement loginbutton;

	public void username1(String use) {
		username1.sendKeys(use);
	}

	public void password1(String paas1) {
		password1.sendKeys(paas1);
	}

	public void loginbutton() {
		loginbutton.click();
	}
}

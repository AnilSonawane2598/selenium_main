package Pom_page_object_model_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	WebDriver driver;

	// create constructor
	public loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name=\"email\"]")
	WebElement email;

	@FindBy(id = "pass")
	WebElement password;

	@FindBy(xpath = "//button[@value=\"1\"]")
	WebElement button;

	String url = "https://www.facebook.com/";

	// for usrname input
	public void email(String input) {
		email.sendKeys(input);

	}

	// for password input
	public void pass(String pass1) {
		password.sendKeys(pass1);
	}

	// for click login button
	public void click() {
		button.click();
	}

	// for open URLpage
	public void openpage() {
		driver.get(url);
	}
}

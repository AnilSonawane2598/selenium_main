package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpagechildclass {
WebDriver driver;
		
@FindBy(xpath="//input[@name=\"username\"]")
WebElement id;

@FindBy(xpath="//input[@name=\"password\"]")
	WebElement password;

@FindBy(xpath="//button[@type=\"submit\"]")
WebElement button;
	
public loginpagechildclass(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void id(String email) {
	id.sendKeys(email);
}
public void password(String pass) {
	password.sendKeys(pass);
}
public void button( ) {
	button.click();
}
public void enter() {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

}

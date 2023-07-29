package pom_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pimchildclass2 {

	// with page factory
	
	// list box not working
	WebDriver driver;

	@FindBy(xpath = "//span[text()='PIM']")
	WebElement pim;

	@FindBy(xpath = "(//div[@class=\"oxd-select-text--after\"])[3]")
	WebElement jobtitle;
	
	@FindBy(xpath="//div[@role=\"listbox\"]//div")
	List<WebElement> list;


	public pimchildclass2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void pim() {
		pim.click();
	}

	public void jobtitle() {
		jobtitle.click();
	}
	String data1="HR Manager";
	public void list(String str,String str1) {
		List<WebElement> ele=driver.findElements(By.xpath(str1));
		for(int i=0;i<ele.size();i++) {
			if(ele.get(i).getText().equals(str1))
				list.get(i).click();
		}
	}
}

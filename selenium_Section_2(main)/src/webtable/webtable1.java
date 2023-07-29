package webtable;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.crome.Driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("(//h3[contains(text(),'Example')])[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		// find row
	int a=	driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
	System.out.println("total rows are -->"+a);
	
	//find col
int b=	driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("total col are-->"+b);
		
		//find specific data
	String s=	driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[5]/td[2]")).getText();
		System.out.println(s);
		
		for(int i=2;i<=a;i++) {
			for(int j=1;j<=b;j++) {
		String data=	driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print(data+" || ");
		}
		
			System.out.println();
		}
	}

}

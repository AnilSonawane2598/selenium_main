package DEMO;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

		
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "\"D:\\INSTALLER FILE\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/");
		
		
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
	//	Point p2=new Point(500,300);
	//	System.out.println(p2);
		
		String title=driver.getTitle();
		System.out.println("CURRENT TITLE  "+title);
		
		String s="Stack Overflow - Where Developers Learn, Share, & Build Careers";
		
		if (s.equals("Stack Overflow - Where Developers Learn, Share, & Build Careers")){
			
			System.out.println("currect title");}
			
			else {
				System.out.println("wrong title");
			}
		
		String url=driver.getCurrentUrl();
		System.out.println("CURRENT URL IS  "+url);
		
		
String s1="https://stackoverflow.com/";
		
		if (s1.equals("https://stackoverflow.com/")){
			
			System.out.println("currect URL");}
			
			else {
				System.out.println("wrong URL");
			}
	//	Point p=new Point(500,300);
	//	System.out.println(p);
		
	//	driver.manage().window().getPosition();
		
		
		Thread.sleep(4000);
		driver.close();
		}

	

}
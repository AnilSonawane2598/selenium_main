package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeSuite
public void a() {
	System.out.println("@BeforeSuite--> hi");
}
	@BeforeTest
	public void b() {
		System.out.println("@BeforeTest");
	}
	@BeforeClass
	public void c() {
		System.out.println("@BeforeClass");
	}
	@BeforeMethod
	public void d() {
		System.out.println("@BeforeMethod");
	}
	@Test
	public void login() {
		System.out.println("login page");
	}
	@Test
	public void regester() {
		System.out.println("Regester page");
	}
	@AfterMethod
	public void e() {
		System.out.println("@AfterMethod");
	}
	@AfterClass
	public void f() {
		System.out.println("@AfterClass");
	}
	@AfterSuite
	public void g() {
		System.out.println("@AfterSuite");
	}
	@AfterTest
	public void h() {
		System.out.println("@AfterTest");
	}
}

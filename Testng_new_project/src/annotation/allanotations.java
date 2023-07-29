package annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class allanotations {
	@BeforeSuite
	public void a()	{
		System.out.println("@BeforeSuite"+"a");
	}
	@BeforeTest
	public void b()	{
		System.out.println("@BeforeTest"+"b");
	}
	@BeforeClass
	public void c()	{
		System.out.println("@BeforeClass"+"c");
	}
	@BeforeMethod
	public void d()	{
		System.out.println("BeforeMethod"+"d");
	}
	@Test
	public void e()	{
		System.out.println("e");
	}
	@AfterMethod
	public void f()	{
		System.out.println("@AfterMethod" +"f");
	}
	@AfterClass
	public void g()	{
		System.out.println("@AfterClass"+"g");
	}
	@AfterSuite
	public void h()	{
		System.out.println("@AfterSuite"+"h");
	}
	@AfterTest
	public void i()	{
		System.out.println("AfterTest"+"i");
	}
	@Test
	public void j()	{
		System.out.println("j");
	}
}

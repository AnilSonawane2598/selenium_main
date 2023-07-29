package TestNg;

import org.testng.annotations.Test;

public class enable {
	@Test(enabled=true)
public void a() {
	System.out.println("test a");
}
	@Test(enabled=false)
public void b() {
	System.out.println("test b");
}
	@Test(enabled=false)
public void c() {
	System.out.println("test c");
}
	@Test(enabled=true)
public void d() {
	System.out.println("test d");
}
	@Test
public void e() {
	System.out.println("test e");
}
}

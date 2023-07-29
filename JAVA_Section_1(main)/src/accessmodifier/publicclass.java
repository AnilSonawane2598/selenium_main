package accessmodifier;

public class publicclass {

	public static void main(String [] args) {
		
		publicclass p2=new publicclass();
		p2.h1();
		p2.h2();
		p2.h3();
		p2.h4();
	}
	public void h1() { // public mod
		System.out.println("METHOD 1 PUBLIC");
	}
	protected void h2() { // protected mod
		
		System.out.println("METHOD 2 PROTECTED");

}
private void h3() { // private mod
		
		System.out.println("METHOD 3 PRIVATE");

}
 void h4() {  // Default mod
	
	System.out.println("METHOD 4 DEFAULT");

}
}
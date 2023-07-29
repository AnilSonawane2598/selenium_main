package constructor;

public class newcon {
	public static void main (String []args) {
		
		int sum=0;
	for(int i=1;i<=20;i++) 
		sum=sum+i;
		System.out.println(sum);
		
		newcon nn=new newcon();
		nn.b();
}
	public void b() {
		int mark=68;
		if (mark>=70) {
			System.out.println("DISTINCTION");
		}
		else if (mark>=60) {
			System.out.println("FIRST CLASS");
		}
		else if(mark>=55) {
			System.out.println("HIGHER SECOND CLASS");
		}
		else if(mark>=50) {
			System.out.println("SECOND CLASS");
		}										
		else if(mark>=35) {
			System.out.println("PASS CLASS");                     
		}
		else {
			System.out.println("FAIL");
	}
	
	
//	public static void a1() {
//		int sum=0;
//	for(int i=1;i<=20;i++) {
//		sum=sum+i;
//		System.out.println(sum);
//	}
	}
	
	}
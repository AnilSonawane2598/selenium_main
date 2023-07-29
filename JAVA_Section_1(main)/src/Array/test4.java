package Array;

public class test4 { // find max number

	public static void main(String[] args) {
		test4 t4=new test4();
		t4.s();
int y[]= {5,56,354,345,6,35};
int max=y[0];
for(int i=0;i<y.length;i++) {
	if(y[i]>max) {
		max=y[i];
	}
}
System.out.println(max);


	}
	public void s() {
	int t[]= {4,556,66,7,6,7,76};
	int max=t[0];
	for(int i=0;i<t.length;i++) 
		if(t[i]>max) {
			max=t[i];
		}	
	System.out.println(max);
	}


}

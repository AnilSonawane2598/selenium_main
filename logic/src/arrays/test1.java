package arrays;

public class test1 {  // max

	public static void main(String[] args) {
int t[]= {1,2,3,4,6,7};
int max=t[0];
for(int i=0;i<t.length;i++) {
	if (max<t[i]) {
		max=t[i];
		
	}
}
System.out.println(max);
	
	}

}

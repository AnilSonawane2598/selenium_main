package array2;

public class test { // max

	public static void main(String[] args) {
int t[]= {1,3,5,7,8,9,96};
int max=t[0];
for(int i=0;i<t.length;i++) {
	if(max<t[i]) {
		max=t[i];
		
	}
	
}
System.out.println(max);
	}

}

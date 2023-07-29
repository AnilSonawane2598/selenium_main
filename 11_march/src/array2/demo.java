package array2;

public class demo { // find max no

	public static void main(String[] args) {
		a();
		System.out.println();
int t[]= {1,2,3,4,5,6,7};
int max=t[0];

for(int i=0;i<t.length;i++) {
	if(max<t[i]) {
		max=t[i];	
	}
}
System.out.println(max);
	}
	public static void a() { // find duplicate number
		int t[]= {1,1,2,3,4,5,6,7};
		for(int i=0;i<t.length;i++) {
			for(int j=i+1;j<t.length;j++) {
				if(t[i]==t[j]) {
					System.out.println(t[j]);
				}
			}
		}
	}

}

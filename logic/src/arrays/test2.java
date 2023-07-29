package arrays;

public class test2 {

	public static void main(String[] args) {
		int t[]= {1,2,3,4,6,7,7};
for(int i=0;i<t.length;i++) {
	for(int j=i+1;j<t.length;j++) {
		if(t[i]==t[j]) {
			System.out.println(t[j]);
		}
	}
}
	}

}

package array2;

public class test1 {

	public static void main(String[] args) {
		int t[]= {1,3,5,7,7,8,9,96};
for(int i=0;i<t.length;i++) {
	for(int j=i+1;j<t.length;j++) {
		if (t[i]==t[j])
			System.out.println(t[j]);
	}
}
	}

}

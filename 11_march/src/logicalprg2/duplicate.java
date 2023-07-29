package logicalprg2;

public class duplicate {

	public static void main(String[] args) {
int t[]= {1,4,5,7,3,4};
for (int i=0;i<t.length;i++) {
	for (int j=i+1;j<t.length;j++) {
		if(t[i]==t[j]) {
			System.out.println(t[j]);
		}
	}
}
	
	}

}

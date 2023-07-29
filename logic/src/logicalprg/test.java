package logicalprg;

public class test {

	public static void main(String[] args) {
int ar[]= {1,2,3,4,5,6,6};
for(int i=0;i<ar.length;i++) {
	for(int j=i+1;j<ar.length;j++) {
		if(ar[i]==ar[j]) {
			System.out.println(ar[j]);
		}
	}
}
	}

}

package Array;

public class demo8 { // find duplicate number

	public static void main(String[] args) {
int u[]= {5,66,7,4,78,979,89,89};
for(int i=0;i<u.length;i++) {
	for(int j=i+1;j<u.length;j++) {
		if(u[i]==u[j]) {
			System.out.println(u[j]);
		}
	}
}
	}

}

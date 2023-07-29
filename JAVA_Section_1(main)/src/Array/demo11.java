package Array;

public class demo11 {

	public static void main(String[] args) {
int k[][]= {{45,56,67},{42,34,52},{66,88,99},{57,87,91}};
System.out.println(k.length);
System.out.println(k[0].length);
for(int i=0;i<k.length;i++) {
	for(int j=0;j<k[0].length;j++) {	
		System.out.print(k[i][j]+" ");
	}
	System.out.println();
}

	}

}

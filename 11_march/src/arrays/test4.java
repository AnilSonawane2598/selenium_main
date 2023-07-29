package arrays;

public class test4 {

	public static void main(String[] args) {
int t[][]= {{1,2,3},{4,5,6},{7,8,9},{0,4,8}};
System.out.println(t.length);
System.out.println(t[0].length);

for(int i=0;i<t.length;i++) {
	for(int j=0;j<t[0].length;j++) {
		System.out.print(t[i][j]+" ");
	}
	System.out.println();
}
	}

}

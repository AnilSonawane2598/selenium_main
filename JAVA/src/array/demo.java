package array;

import java.lang.reflect.Array;

public class demo {

	public static void main(String[] args) {
int a[][]= {{1,2,3,0},{4,5,6,0},{7,8,9,0}};
System.out.println(a[1].length);
System.out.println(a.length);
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a[1].length;j++) {
		
	
	System.out.print(a[i][j]+" ");
}
	System.out.println();
	}
}
}

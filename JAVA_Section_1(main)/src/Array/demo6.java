package Array;

import java.util.Arrays;

public class demo6 { // two dimensional array 

	public static void main(String[] args) {
int t1[][]= {{4,5,6},{1,32,45},{7,8,9},{4,45,37}};
System.out.println(t1.length);
System.out.println(t1[0].length);
//Arrays.sort(t1);

for(int i=0;i<t1.length;i++) {
	for(int j=0;j<t1[0].length;j++) {
		System.out.print(t1[i][j]+" ");
	}
	System.out.println();
}
//for(int i=0;i<t1.length;i++) {
//	for(int j=i+1;j<t1[0].length;j++) {
//		if(t1[i]==t1[j]) {
//			System.out.println(t1[i][j]);
		}
		//System.out.println();

}

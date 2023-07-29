package Array;

import java.util.Arrays;

public class demo4 { //  find max number

	public static void main(String[] args) {
int s1[]= {4,45,55,76,87,4,4566,67677,45};
System.out.println(s1.length);
//System.out.println();
//Arrays.sort(s1);
int max=s1[0];
for(int i=0;i<s1.length;i++) {
	if(s1[i]>max) {
		max=s1[i];
	}
}
	System.out.println(max);
	System.out.println();
	int ma=s1[0];
	for(int i=0;i<s1.length;i++) {
		if(s1[i]>ma) {
			ma=s1[i];
			
		}
	}
	System.out.println(ma);
	
//	demo4.a1();
}
//	public static void a1() {
//int s2[]= {54,5,75,78,45,};
//int max=s2[0];
//for(int i=s2.length;s2[i]>=0;i--) {
//	if(s2[i]<max) {
//		max=s2[i];
//	}}
//	System.out.println(max);

//	//for(int i=10;i>=0)


}

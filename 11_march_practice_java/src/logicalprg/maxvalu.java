package logicalprg;

import java.util.Arrays;

public class maxvalu {

	public static void main(String[] args) {
		int a[]= {45,567,1,2,3,4,5,6,7,8};
		int max=0;
		System.out.println(a.length);
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			if(max<a[i])
			max=a[i];{
		}}
		System.out.println(max);

	}

}

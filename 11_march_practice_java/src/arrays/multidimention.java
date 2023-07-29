package arrays;

import java.util.Arrays;

public class multidimention {

	public static void main(String[] args) {
		String a[][]=new String [2][2];
		a[0][0]="anil";
		a[0][1]="rahul";

		a[1][0]="kiran";
		a[1][1]="ramesh";

		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}

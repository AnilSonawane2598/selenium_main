package arrays;

import java.util.Arrays;

public class single {

	public static void main(String[] args) {
		int a[]= new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		System.out.println(a.length);
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("**************");
		int b[]= {2,3,5,7,1};
		Arrays.sort(b);
		System.out.println(b.length);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
			
		}

	}

}

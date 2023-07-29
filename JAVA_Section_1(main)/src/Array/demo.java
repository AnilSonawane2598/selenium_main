package Array;

import java.util.Arrays;

public class demo {  // single dimensional array
int u=20;
static int y=10;
	public static void main(String[] args) {
		 int d[] =new  int[5];
		d[0]=6;
		d[1]=4;
		d[2]=5;
		d[3]=3;
		d[4]=1;
//		d[5]=6;       Index 5 out of bounds for length 5 because of we declare 5 fixed element

		System.out.println(y);  // calling static variable same class
		System.out.println(d.length);
		Arrays.sort(d);
		for(int i=0;i<d.length;i++) {
			System.out.print(d[i]+" ");
		}

	}

}

package Array;

import java.util.Arrays;

public class test {  // single dimensional array

	public static void main(String[] args) {
		// array declaration 
char c[]=new char[5];

// array initialization
c[0]='B';
c[1]='A';
c[2]='E';
c[3]='D';
c[4]='C';

// ARRAY USAGE
System.out.println(c.length); // to find length of array
Arrays.sort(c);
for (int i=0;i<c.length;i++) {
	System.out.print(c[i]+" ");
}

	}

}

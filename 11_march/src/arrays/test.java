package arrays;

import java.util.Arrays;

public class test {  // single dimensional array

	public static void main(String[] args) {
int i1[]= new int[3];
i1[0]=1;
i1[1]=3;
i1[2]=2;
Arrays.sort(i1);
System.out.println(i1.length);
for(int i=0;i<i1.length;i++) {
	System.out.println(i1[i]);
	
}

	}

}

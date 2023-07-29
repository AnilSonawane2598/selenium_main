package arrays;

import java.util.Arrays;

public class demo {
public static void main(String[] args) {
	int t[]= {1,2,3,4,5,6,7,55,32,11};
	System.out.println(t.length);
Arrays.sort(t);
for(int i=0;i<t.length;i++) {
	System.out.print(t[i]+" ");
}
}
}

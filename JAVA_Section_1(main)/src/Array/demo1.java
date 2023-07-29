package Array;

import java.util.Arrays;

public class demo1 {  // single dimensional array

	public static void main(String[] args) {
demo r=new demo();
System.out.println(demo.y);  // calling static global variable in other class
System.out.println(r.u);  // calling non static global variable in other class
System.out.println();

String s[]=new String[4];
s[0]="anil";
s[1]="1234";
s[2]="KIRAN";
s[3]="RAMESH";

System.out.println(s.length);
Arrays.sort(s);
for(int i=0;i<s.length;i++) {
	System.out.println(s[i]);
	
}


	}

}

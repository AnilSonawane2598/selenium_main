package Array;

//import java.util.Arrays;

public class demo2 {  // Hetrogenic or non similar object class FOR USE ALL DATA TYPE 

	public static void main(String[] args) {
Object obj[]=new Object[5];// for access all data type we use object array
obj[0]=1234;  // int
obj[1]="ANIL"; // string
obj[2]=66.7f; // float
obj[3]=true; // boolean
obj[4]='A'; // char
System.out.println(obj.length); // to find length
//Arrays.sort(obj); // to sort the element sequence order
for(int i=0;i<5;i++) {
	System.out.println(obj[i]);
}
	}

	}



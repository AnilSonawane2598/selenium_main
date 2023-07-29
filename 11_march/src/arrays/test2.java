package arrays;

public class test2 {  // Multidimensional arrays or two dimensional array

	public static void main(String[] args) {	
int i2[][]= new int[2][3];
i2[0][0]=1;
i2[0][1]=2;
i2[0][2]=3;

i2[1][0]=4;
i2[1][1]=5;
i2[1][2]=6;

System.out.println(i2.length);
System.out.println(i2[0].length);

for(int i=0;i<i2.length;i++) {
	for(int j=0;j<i2[0].length;j++) {
		System.out.print(i2[i][j]+" ");
	}
	System.out.println();
}


	}

}

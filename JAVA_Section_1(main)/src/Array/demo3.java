package Array;

public class demo3 { // multidimensional arrays

	public static void main(String[] args) {
int raj[] []=new int [3][2];  
raj[0][0]=10;
raj[0][1]=20;
//raj[0][2]=40;

System.out.println();

raj[1][0]=30;
raj[1][1]=50;
//raj[1][2]=60;

System.out.println();
raj[2][0]=70;
raj[2][1]=60;
for(int i=0;i<raj.length;i++) {
	for(int j=0;j<raj[1].length;j++) {
		System.out.print(raj[i][j]+" ");
	}
	System.out.println();
}

	}

}

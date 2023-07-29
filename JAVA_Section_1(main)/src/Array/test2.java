package Array;
import java.util.Arrays;
public class test2 {
	public static void main(String[] args) {
		
	
	// two dimensional array
Object t1[][]=new Object[4][5];
t1[0][0]="A";
t1[0][1]="B";
t1[0][2]="C";
t1[0][3]="D";
t1[0][4]="E";
System.out.println();
t1[1][0]="a1";
t1[1][1]="b1";
t1[1][2]="c1";
t1[1][3]="d1";
t1[1][4]="e1";
System.out.println();
t1[2][0]=1;
t1[2][1]=4;
t1[2][2]=2;
t1[2][3]=3;
t1[2][4]=5;
System.out.println();
t1[3][0]=10.00f;
t1[3][1]=30.00f;
t1[3][2]=20.00f;
t1[3][3]=40.00f;
t1[3][4]=50.00f;
//System.out.println();
//t1[4][0]=true;
//t1[4][1]=false;
//t1[4][2]=true;
//t1[4][3]=false;
//t1[4][4]=false;
System.out.println(t1.length);
Arrays.sort(t1[2]);
for(int i=0;i<t1.length;i++) {
	for(int j=0;j<t1[1].length;j++) {
		System.out.println(t1[i][j]);
		
	}
}
}
}
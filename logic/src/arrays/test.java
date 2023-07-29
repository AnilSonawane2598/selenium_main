package arrays;

public class test {

	public static void main(String[] args) {
		m(5);
int t[]=new int[2];
t[0]=1;
t[1]=2;
System.out.println(t.length);
for(int i=0;i<t.length;i++) {
	System.out.print(t[i]+" ");
}
	}
public static void m(int s) {
	int e[][]=new int [2][2];
	e[0][0]=6;
	e[0][1]=7;
	
	e[1][0]=5;
	e[1][1]=9;
	System.out.println(e.length);
	System.out.println(e[1].length);
	
	for(int i=0;i<e.length;i++) {
		for(int j=0;j<e[1].length;j++) {
			System.out.print(e[i][j]+" ");
		}
		System.out.println();	
	}
	
}
}

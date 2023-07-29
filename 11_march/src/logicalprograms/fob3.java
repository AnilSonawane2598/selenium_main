package logicalprograms;

public class fob3 {

	public static void main(String[] args) {
int a=-1;
int b=1;
int c;
for(int i=0;i<10;i++) {
	c=a+b;
	System.out.print(c+" "); // 0 1 1 2 3 5 8 13
	a=b;// 1 0  1   1
b=c; //  0   1  1  2
}
	}
}

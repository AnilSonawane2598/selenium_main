package logicalprograms;

public class fobn2 {

	public static void main(String[] args) {
int a=-1;
int b=1;
int sum;
for(int i=1;i<10;i++) {
	sum=a+b; // 0
	System.out.print(sum);
	a=b;
	b=sum;

}
	}


}
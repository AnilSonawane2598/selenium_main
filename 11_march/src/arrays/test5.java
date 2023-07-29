package arrays;

public class test5 { // find max no

	public static void main(String[] args) {
int r[]= {1,2,3,4,5,6,7,8,9,0};
int max=r[0];
for(int i=0;i<r.length;i++) {
	if(r[i]>max) { // if (r[i]<max) use to find minimum number
		max=r[i];
	}
}
	System.out.println(max);


}
	}

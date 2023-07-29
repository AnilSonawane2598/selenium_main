package arrays;

public class max {

	public static void main(String[] args) {
int r[]= {3,56,767,2,4,223,6556};
int max=r[0];
for(int i=0;i<r.length;i++) {
	if(r[i]>max)
		max=r[i];
}
System.out.println(max);
	}

}

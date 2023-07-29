package arrays;

public class max {

	public static void main(String[] args) {
int v[]= {1,2,3,4,5,6,7,8,9};
int max=v[0];
System.out.println(v.length);
for(int i=0;i<v.length;i++) {
		if (v[i]>max) {
			max=v[i];
		}
	}
System.out.println(max);
}
	}



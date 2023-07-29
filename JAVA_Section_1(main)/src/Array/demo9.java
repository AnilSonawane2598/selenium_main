package Array;

public class demo9 { // max no

	public static void main(String[] args) {
int t[]= {1,4,6,76,98,89,9,6,456};
int max=t[0];
for(int i=0;i<t.length;i++) {
	if(max<t[i]) {
		max=t[i];
	}
}
System.out.println(max);
	}

}

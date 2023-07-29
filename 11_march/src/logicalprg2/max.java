package logicalprg2;

public class max {

	public static void main(String[] args) {
		int t[]= {1,4,5,7,3,4};
		int max=t[0];
		for(int i=0;i<t.length;i++) {
			if(t[i]>max) {
				max=t[i];
			}
		}
		System.out.println(max);
	}

}

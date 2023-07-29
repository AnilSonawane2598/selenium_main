package logicalprg;

public class test1 {

	public static void main(String[] args) {
		int ar[]= {1,2,75,778,966,234,3,4,5,6,9};
		int max=ar[0];
		for (int i=0;i<ar.length;i++) {
			if(ar[i]>max)
				max=ar[i];
		}
System.out.println(max);
	}

}

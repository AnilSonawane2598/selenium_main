package arrays;

public class duplicat {

	public static void main(String[] args) {
int t[]= {1,2,3,4,5,6,7,8,9,9};

for(int i=0;i<t.length;i++) {
	for(int j=i+1;j<t.length;j++) 
		if(t[i]==t[j])
		{	
	System.out.print(t[j]);
}
}	
}
}
	
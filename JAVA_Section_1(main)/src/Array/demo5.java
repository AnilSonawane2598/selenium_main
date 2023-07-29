package Array;

public class demo5 { // find duplicate number

	public static void main(String[] args) {
int i1[]= {1,5,6,7,3,456,23,3};
//i1[0]=0;
for(int i=0;i<i1.length;i++) {
	for(int j=i+1;j<i1.length;j++) {
		if(i1[i]==i1[j]){
		System.out.println(i1[j]+" ");
	 }
	}
  }
 }
}

package arrays;

public class duplicate {

	public static void main(String[] args) {
int r[]= {1,2,3,4,5,6,7,8,9,9};

	for(int i=0;i<r.length;i++) {
		for(int j=i+1;j<r.length;j++) 
			if(r[i]==r[j]) {
				System.out.println(r[j]);

			}
	
		}
	
	}
	}



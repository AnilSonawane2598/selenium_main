package Array;

public class dplicate2 {
public static void main(String[] args) {
	h();
	int d[]= {4,4,6,77,3,423,4234,97};
	for(int i=0;i<d.length;i++) {
		for(int j=i+1;j<d.length;j++) {
			if(d[i]==d[j]) {
				System.out.println(d[j]);
			}
		}
	}
}
public static void h() {
int f[]= {5,6,7,78,96,4,34,5};
for(int i=0;i<f.length;i++) {
	for(int j=i+1;j<f.length;j++) {
		if(f[i]==f[j]) {
			System.out.println(f[j]);
		}
	}
}
}
}

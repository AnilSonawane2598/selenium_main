package Array;

public class test1 { // single dimensional array

	public static void main(String[] args) {
Object obj[]= new Object[8];
obj[0]=1234;
obj[1]='G';
obj[2]="ANIL";
obj[3]=12.67f;
obj[4]=12345667678l;
obj[5]=123445675677d;
obj[6]=true;
obj[7]=676778;
for(int i=0;i<obj.length;i++) {
	System.out.println(obj[i]);
}
	}

}

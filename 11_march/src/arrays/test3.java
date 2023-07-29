package arrays;

//import java.util.Arrays;

public class test3 {

	public static void main(String[] args) {
Object obj[]=new Object[5];
obj[0]='a';
obj[1]="anil";
obj[2]=123;
obj[3]=45.54f;
obj[4]=false;

System.out.println(obj.length);
//Arrays.sort(obj);

for(int i=0;i<obj.length;i++) {
	System.out.println(obj[i]);
}

	}

}

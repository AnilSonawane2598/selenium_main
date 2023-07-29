package logicalprg2;

public class reveachwod2 {
	
public static void main(String[] args) {
	String s="anil balu sonawane";
	String s1[]=s.split(" ");
	String rev ="";
	for (String word:s1) {
		String s2="";
		for(int i=word.length()-1;i>=0;i--) {
			s2=s2+word.charAt(i);
		}
		rev=rev+s2+" ";
	}
	System.out.println(rev);
}
}

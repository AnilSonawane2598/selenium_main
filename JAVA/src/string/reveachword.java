package string;

public class reveachword {

	public static void main(String[] args) {
String s="anil balu sonawane";
String s1[]=s.split(" ");
String rev="";
for (String o:s1) {
	String s2="";
	for(int i=o.length()-1;i>=0;i--) {
		s2=s2+o.charAt(i);
	}
	rev=rev+s2+" ";
}
	System.out.println(rev);
}
	}



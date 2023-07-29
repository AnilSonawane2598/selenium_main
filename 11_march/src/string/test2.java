package string;

public class test2 {  // reverse the number

	public static void main(String[] args) {
String s="abcdefg";
String rev="";
for(int i=s.length()-1;i>=0;i--	) {
	rev=rev+s.charAt(i);
}
System.out.println(rev);

	}

}

package string;

public class demo {

	public static void main(String[] args) {
String s="anil";
String s2="  rahul sarode";
String s1=new String("anil");
System.out.println(s2.charAt(4));
System.out.println(s2.indexOf('e'));
System.out.println(s2.lastIndexOf('e'));
System.out.println(s2.length());
System.out.println(s2.toLowerCase());
System.out.println(s2.toUpperCase());
System.out.println(s2.isEmpty());
System.out.println(s2.trim());
System.out.println(s2.replace('e', 's'));
System.out.println(s2.replaceAll("rahul", "ramesh"));
System.out.println(s2.concat(s));
System.out.println(s2.substring(1, 7));
System.out.println(s2.substring(4));
System.out.println();


String s4[]=s2.split(" ");
for(int i=0;i<s4.length;i++) {
	System.out.println(s4[i]);
}

	String s5="abcdefg";
	System.out.println(s5.length());
	for(int i=s5.length()-1;i>=0;i--) {
		System.out.print(s5.charAt(i));
	}


	}
}
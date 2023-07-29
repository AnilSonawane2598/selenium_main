package string;

public class demo {

	public static void main(String[] args) {
String s="anil";
String s1="rahul sarode  ";
String s2=new String("ramesh");
System.out.println(s.charAt(1));
System.out.println(s.substring(2));
System.out.println(s.substring(0, 2));
System.out.println(s.toLowerCase());
System.out.println(s.toUpperCase());
System.out.println(s.replace('a', 'h'));
System.out.println(s.replaceAll("anil", "kiran"));
System.out.println(s.isEmpty());
System.out.println(s1.trim());
System.out.println(s1.lastIndexOf('l'));
System.out.println(s.indexOf('n'));
System.out.println(s.length());
System.out.println(s.equals(s2));
System.out.println(s.equals(s1));
System.out.println();
String s5[]=s1.split(" ");
for(int i=0;i<s5.length;i++) {
	System.out.println(s5[i]);
}
System.out.println();
String s6[]=s1.split(" ");
for(int i=s6.length-1;i>=0;i--) {
	System.out.println(s6[i]);
}

	}

}

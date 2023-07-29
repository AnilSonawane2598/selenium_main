package string;

public class test {

	public static void main(String[] args) {
String s="HELLO  ";
String s1="HELLO";
String s3="HELLOW";
String s7="HELLOW WORD";


String s4= new String("HELLO");
String s5= new String("HELLO");
String s6= new String("Hii");

System.out.println(s);
System.out.println(s+s1);
System.out.println(s==s1);
System.out.println(s.equals(s1));

System.out.println(s4==s5);
System.out.println(s4.equals(s5));
System.out.println(s==s3);
System.out.println(s4==s6);
System.out.println(s4.equals(s6));
System.out.println(s.charAt(0)); // find value  of index
System.out.println(s.replace('H', 'B'));// REPLACE EACH WORD
System.out.println(s7.replaceAll("HELLOW", "ANIL"));// REPLACE WHOLE WORD
System.out.println(s.toLowerCase());
System.out.println(s.toUpperCase());
System.out.println(s.isEmpty());
System.out.println(s.indexOf('H')); // find index of value
System.out.println(s.trim());
System.out.println(s.lastIndexOf('O'));
System.out.println(s.length());
}

	
}

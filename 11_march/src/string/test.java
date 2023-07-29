package string;

public class test {

	public static void main(String[] args) {
String s="ANIL SONAWANE";  // by string literal
String s1="anil balu sonawane";
String s2="  anil   ";

String s3=new String("kiran"); // by using new keyword
String s4=new String("kiran");
String s5=new String("rahul");

String s6=new String ("ANIL SONAWANE");

System.out.println(s==s1); // false
System.out.println(s1==s2); // false
System.out.println(s1==s3); // false
System.out.println(s3==s4);// false
System.out.println(s3.equals(s4));// true
 System.out.println(s.length());// 13
 System.out.println(s.charAt(2));// i
 System.out.println(s.indexOf('I'));//2
System.out.println(s.substring(1,4));// 
System.out.println(s.isEmpty());// string is empty or not
System.out.println(s2.trim()); // to remove beg and ending space
System.out.println(s.toLowerCase()); //
System.out.println(s.toUpperCase()); //
System.out.println(s.replace('A','D'));//
System.out.println(s.replaceAll("ANIL", "GANESH"));// 
System.out.println(s5.length());// to find lenth
	}
	

}

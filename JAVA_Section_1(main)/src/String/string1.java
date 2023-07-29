package String;

public class string1 {

	public static void main(String[] args) {
String s1=new String("ANIL balu sonawane");
String s5[]=s1.split(" ");
for(int i=0;i<s5.length;i++) {
	System.out.println(s5[i]);
}
String s2=new String("ANIL");
String s3=new String("");
	String s4="   my name is ANIL   ";
	


System.out.println(s1.equals(s2));
System.out.println(s1.length()); // find length
System.out.println(s1.charAt(3));// find char 
System.out.println(s3.isEmpty());  // to cheak string is empty or not
System.out.println(s1.replace('A', 'B')); // TO REPLACE CHAR IN STRING
System.out.println(s1.replaceAll(s2, s3));
System.out.println(s4.replaceAll("my", "HHIS")); // TO REPLACE ONE WHOLE WORD
System.out.println(s4.indexOf('i')); // 1st occurence
System.out.println(s4.indexOf('m',s4.indexOf('y')+1)); // 2 nd occurence 
System.out.println(s4.lastIndexOf('y')); // TO FIND LAST element
System.out.println(s4.toLowerCase()); // TO LOWERCASE THE WORD 
System.out.println(s4.toUpperCase()); // to uppercase the word
System.out.println(s4.substring(4,8)); // to sub string the word
System.out.println(s4.trim()); // to rwmove begining and ending space in sentance
System.out.println(s4.replace(" ", "")); // replace space between sentance
//System.out.println(s1.split(" "));
System.out.println();


	}
	

}

package String;

public class lit {

	public static void main(String[] args) {
		
		// by using new keyword
String s1=new String("anil");
String s2=new String ("anil");
System.out.println(s1.equals(s2));
System.out.println(s1==s2);
System.out.println();

// Literature type

String s3="rahul";
String s5="rahul";
String s4="ramesh";
System.out.println(s3==s4);
System.out.println(s3==s5);

System.out.println();
String s6="ganeshsrdrgfsrfgrfg";
System.out.println(s6.charAt(18));// 
System.out.println(s6.length());// cheak the length of string 
 


	}

}

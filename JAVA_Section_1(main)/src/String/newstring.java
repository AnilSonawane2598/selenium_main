package String;

public class newstring {
//	static double i=8459318883d;
	
public static void main(String [] args ) {
	String s3="ANIL";
	String s4="ANIL";
	String s6="";
	String s1=new String("MAHESH");
	String s2=new String("MAHESH");
	String s5=new String("    VISHAWAS    ");
	String s7="rahul/ganesh/ramesh/prakash";
	String s8[]=s7.split("/");

	System.out.println(s1==s2);
//	System.out.println(newstring.i);
//	System.out.println("MAHESH KARADBHAJE MOBLILE NO-->"+"8459318883");
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
	System.out.println(s1==(s4));
	System.out.println(s1.equals(s4));
	System.out.println(s5==s1);
	System.out.println(s5.equals(s1));
	System.out.println(s1.equals(s2));
	System.out.println(s1.length()); // find length
	System.out.println(s1.charAt(2)); // find charector
	System.out.println(s6.isEmpty()); // to find string is empty or not
	System.out.println(s1.replace('M', 'S'));  // REPLACE single charector
	System.out.println(s1.replaceAll("MAHESH", "ANIL")); // replace whole word
	System.out.println(s1.substring(2)); // substring the charector
	System.out.println(s1.substring(1,3)); // substring the word
	System.out.println(s1.indexOf('H')); // find index of word + first occurrence
	System.out.println(s1.indexOf('H',s1.indexOf('H')+1)); // second occurrence
	System.out.println(s1.lastIndexOf('H')); // FIND LAST INDEX
	System.out.println(s1.toUpperCase()); // display word to uppercase
	System.out.println(s1.toLowerCase()); // disaplay word to lowercase
	System.out.println(s5.trim()); // remove the begining and ending space in the word

	for(int i=0;i<s8.length;i++) {
		System.out.print(s8[i]+" ");

	}
	


}
}

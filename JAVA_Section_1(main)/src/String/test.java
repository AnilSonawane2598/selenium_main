package String;

public class test {

	public static void main(String[] args) {
String str= new String("ANIL SONAWANE");
String empty="";
String s1[]= str.split("");

//ystem.out.println(str.charAt(5));// 
System.out.println();
for (int i=str.length()-1;i>=0;i--) {
//	for(i
	empty=empty+str.charAt(i);
	
}
System.out.println(empty);

	}

}


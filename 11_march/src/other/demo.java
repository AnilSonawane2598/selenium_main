package other;

public class demo { // how many character present in a string

	public static void main(String[] args) {
String s="anil sonawane";
int count=0;
for(int i=0;i<s.length();i++) {
	if(s.charAt(i)!=' ')
		count++;
}
System.out.println(count);
	}

}

package logicalprograms;

public class demo { // find only count char in string

	public static void main(String[] args) {
String s=" hi my name is anil%";
System.out.println(s.length());
int num=0;
for(int i=0;i<s.length();i++) {
	if((s.charAt(i)!=' ')&& (s.charAt(i)!='%')) {
		num++;
	}
}
System.out.println(num);
	}

}

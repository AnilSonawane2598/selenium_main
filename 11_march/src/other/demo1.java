package other;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("deepak");
String s=sc.nextLine();
for(int i=0;i<s.length();i++) {
	char ch=s.charAt(i);
	if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'|| ch=='u') {
		System.out.println("");
	}
	else if(ch !=' ') {
		count++;
	}
}
System.out.println(count);
	}

}

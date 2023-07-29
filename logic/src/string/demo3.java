package string;

public class demo3 {// rev each word

	public static void main(String[] args) {
		String s="ANIL BALU SONAWANE";
		String s1[]=s.split(" ");
		String rev="";
		for(String str:s1 ) {
			String s2="";
			for(int i=str.length()-1;i>=0;i--) {
				s2=s2+str.charAt(i);
			}
		
		rev=rev+s2+" ";
		
		}	
		System.out.println(rev);
	}

}




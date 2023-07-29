package logical_main;

public class reveachword {

	public static void main(String[] args) {

		String s="rahul dig sarode";
		String s1[]=s.split(" ");
		String rev="";
		for(String str:s1) {
			String s2="";
			for(int i=str.length()-1;i>=0;i--) {
				s2=s2+str.charAt(i);
			}
		
		rev=rev+s2+" ";
	}
		System.out.println(rev);
	}
}

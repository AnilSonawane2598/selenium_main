package logical_prg;

public class reveachword {

	public static void main(String[] args) {
		String str="anil balu sonawane";
		String s[]=str.split(" ");
		String rev="";
		for(String data:s) {
			String s2="";
			for(int i=data.length()-1;i>=0;i--) {
				s2=s2+data.charAt(i);
			}
			rev=rev+s2+" ";
		}
		System.out.println(rev);
	}

}

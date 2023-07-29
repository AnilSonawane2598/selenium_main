package logical_main;

public class duplicatearay {

	public static void main(String[] args) {

		int g[]= {1,2,3,4,5,5,6,7,8,8};
		for(int i=0;i<g.length;i++) {
			for(int j=i+1;j<g.length;j++) {
				if(g[i]==g[j]) {
					System.out.println(g[j]);
				}
			}
		}
	}

}

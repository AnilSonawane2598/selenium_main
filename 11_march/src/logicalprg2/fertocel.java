package logicalprg2;

public class fertocel {

	public static void main(String[] args) {

		// fehrenhiet to cwlsius
		double fehrenhiet ;
		fehrenhiet =50;
		double celsius ;
		celsius=((fehrenhiet-32)*5)/9;
	//	(9/5*cel)+32
		System.out.println(celsius);
		
		// celsius to fehrenhiet
		fehrenhiet =celsius*9/5+32;
		
		System.out.println(fehrenhiet);
	}

}

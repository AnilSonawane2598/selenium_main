package handleexception;

public class throw_keyword {

	public static void main(String[] args) {
		System.out.println("hi");
		try {
			throw new Exception ("automation");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("soso");
	}

}

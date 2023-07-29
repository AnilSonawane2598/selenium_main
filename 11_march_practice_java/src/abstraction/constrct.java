package abstraction;

public abstract class constrct {

	public constrct() {
		this(0);
		System.out.println("main constructor");
	}
	
	public constrct(int a) {
		System.out.println("abstrctor constructor");
	}
}

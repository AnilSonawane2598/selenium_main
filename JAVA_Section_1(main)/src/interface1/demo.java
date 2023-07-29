package interface1;

public interface demo {
	 int u=5;  // static & final global variable 
	
  public abstract void h();  // public & abstract incomplete method
  public abstract void h1();
  public abstract void h2();
    static void h3() {
	  System.out.println("bbbbbb");
  }
  private void h6(int a) {
  	  System.out.println("tyutyj");
}
    default void h4() {
  	  System.out.println("7867");
}
    public default void h6() {
  	  System.out.println("7867");
}
    public static void main(String[] args) {
		
	}
}


package oopsinheritance;

public class singleinharitance {
	
	
	// non static global variable
	String name;
	int std;
	int mark;
	char grade;
	
	
	// CONSTRUCTOR 
	public singleinharitance(String name1,int std1,int mark1,char grade1) {
		name=name1;
		std=std1;
		mark=mark1;
		grade=grade1;
	}
	
	
	public static void main(String[] args) {
anotherinheritance ic=new anotherinheritance();
	ic.m2();
	ic.a1();
	ic.m3();
	ic.a2();
	ic.a3();
	ic.getClass();
	a1();
	System.out.println("**********************************");
	 // OBJECT CRIATION
	singleinharitance st=new singleinharitance("ANIL", 15, 80, 'B');
	singleinharitance st1=new singleinharitance("PRITI", 8, 70, 'B');
	
	// OBJECT  USAGE
	System.out.println(st.name+"  "+st.std+"  "+st.mark+"  "+st.grade);
	System.out.println(st1.name+"  "+st1.std+"  "+st1.mark+"  "+st1.grade);
}
	// STATIC METHOD
	public static void a1() {
		System.out.println("ANkita");
	}
	
}

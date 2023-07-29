package interface1;

public class kio3 {

	public static void main(String[] args) {
		kio2 k1=new kio2();
		k1.a();
		k1.a1();
		k1.a2();
		k1.b();
		k1.b1();
		k1.b2();
		System.out.println();
		kio1 k2=new kio2();
		k2.b();
		k2.b1();
		k2.b2();
		System.out.println();
		kio k3=new kio2();
		k3.a();
		k3.a1();
		k3.a2();
	}

}


package CASTING;

import variable.demo1;

public class demo extends demo1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		demo d = new demo();
		int i = 10;
		System.out.println(i);
		System.out.println(d.e);
		float j = i;
		System.out.println(j); // implicit

		int v = (int) j;
		System.out.println(v);// explicit
		System.out.println(d.g);
		System.out.println();
		int g = 20;
		int t = 50;

	}

}

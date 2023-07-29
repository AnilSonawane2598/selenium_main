package ifstatement;

public class demo1 {
public static void main(String[] args) {
	int number=2000;
	if(number%4==0) {
		System.out.println("leap year");
	}
	else if(number%400==0) {
		System.out.println("leap year");
}
	else
		System.out.println(" not leap year");
}
}
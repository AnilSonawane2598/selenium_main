package other;

import java.util.Arrays;

public class demo2 { // undefined name

	public static void main(String[] args) {
int num[]= {1,2,3,4,5};
int result =Arrays.stream(num)
.filter(n-> n% 2==0)
.map(n->n*n)
.reduce(0, Integer::sum);
System.out.println(result);

	}

}

package ABNumberSeries;

import java.util.Iterator;

public class B2FibonacciSeries {
	public static void printFibonacci1toN(int n) {
		int a = 0;
		int b = 1;
		int c = 0;

		for (int i = 0; i < n; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {
		printFibonacci1toN(10);
	}
}

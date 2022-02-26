package com.dk.home;

public class FibonacciSeriesUsingRecursion {
	static int a = 1, b = 1, c;

	public static void main(String[] args) {

		FibonacciSeriesUsingRecursion fib = new FibonacciSeriesUsingRecursion();
		fib.func(6);
	}

	void func(int i) {
		if (i >= 1) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			func(i - 1);
		}

	}
}

package com.abc.helloworld;

public class HelloWorld {

	private static int multiply(int factor1, int factor2) {
		int product = factor1 * factor2;
		return product;
	}

	public static void add() {
//		int summand1;
//		int summand2;
//		int product = summand1 + summand2;
	}

	public static void main(String[] args) {
		int product1 = multiply(4, 5);
		multiply(3, 2);
		multiply(6, 2);
		multiply(5, 2);
		System.out.println(product1);
	}
}

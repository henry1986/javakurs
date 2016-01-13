package com.abc.helloworld.task3;

public class Fibonacci {

	public static void rec(int start, int start2, int i, int size) {
		int fib = fib(start, start2);
		start = start2;
		start2 = fib;
		System.out.println(i + " = " + start);
		i++;
		if (i < size) {
			rec(start, start2, i, size);
		}
	}
	
	public static void print(int start, int start2, int size) {
		for (int i = 0; i < size; i++) {
			int fib = fib(start, start2);
			start = start2;
			start2 = fib;
			System.out.println(i + " = " + start);
		}
	}

	public static int fib(int i1, int i2) {
		return i1 + i2;
	}

	public static void main(String[] args) {
		rec(1, 1, 0, 15);
//		print(1, 1, 100);
	}
}

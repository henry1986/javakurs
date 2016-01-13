package com.abc.helloworld.task7;

import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set<Integer> fiboMenge = new FibonacciSet();
		for (int i = 0; i < 100; i++) {
			try {
				fiboMenge.add(i);
				System.out.println("i = " + i);
			} catch (NoFibonacciExcetion e) {
				
			}
		}
	}
}
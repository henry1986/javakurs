package com.abc.helloworld.task7;

import java.util.HashSet;

import com.abc.helloworld.task3.Fibonacci;

public class FibonacciSet extends HashSet<Integer> {

	private boolean isFibonacci(int e) {
		if (e == 0 || e == 1) {
			return true;
		}
		int i1 = Fibonacci.fib(0, 1);
		int i2 = Fibonacci.fib(1, i1);
		while (e > i2) {
			int i3 = Fibonacci.fib(i1, i2);
			i1 = i2;
			i2 = i3;
		}
		return e == i2;
	}

	@Override
	public boolean add(Integer e) {
		if (!isFibonacci(e)) {
			throw new NoFibonacciExcetion();
		}
		return super.add(e);
	}
}

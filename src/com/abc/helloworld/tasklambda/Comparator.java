package com.abc.helloworld.tasklambda;

import java.util.function.Consumer;

public class Comparator<T> {
	private final T t;

	public Comparator(T t) {
		super();
		this.t = t;
	}

	public void compare(int i1, int i2, Consumer<T> lower, Consumer<T> equal, Consumer<T> higher) {
		if (i1 > i2) {
			higher.accept(t);
		}
		if (i1 < i2) {
			lower.accept(t);
		}
		equal.accept(t);
	}
}

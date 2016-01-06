package com.abc.helloworld.task6;

public class MyNodeList<T> {

	private Node<T> start;

	public void add(T t) {
		Node<T> last = start;
		while (last.hasNext()) {
			last = last.next();
		}
		last.setNext(new Node<T>(t));
	}
}

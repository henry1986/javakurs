package com.abc.helloworld.task6;

public class Node<T> {

	private Node<T> next;
	private Node<T> prev;
	private final T t;

	public Node(T t) {
		super();
		this.t = t;
	}

	public boolean hasNext() {
		return next != null;
	}

	public Node<T> next() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public void setPrevious(Node<T> prev) {
		this.prev = prev;
	}
}

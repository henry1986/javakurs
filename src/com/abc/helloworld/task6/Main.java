package com.abc.helloworld.task6;

public class Main {

	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList();
		myArrayList.add("Hallo");
		myArrayList.add("Welt");

		MyNodeList<String> myNodeList = new MyNodeList<>();
		myNodeList.add("Hallo");
		myNodeList.add("Welt");
	}

}

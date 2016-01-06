package com.abc.helloworld.task6;

public class MyArrayList {

	private String[] array;
	private int index;

	public MyArrayList() {
		super();
		array = new String[5];
		index = -1;
	}

	private void resizeArray() {
		index++;
		if (index == array.length) {
			String[] tmp = new String[array.length + 5];
			for (int i = 0; i < array.length; i++) {
				String string = array[i];
				tmp[i] = string;
			}
			array = tmp;
		}
	}

	public void add(String t) {
		resizeArray();
		array[index] = t;
	}

}

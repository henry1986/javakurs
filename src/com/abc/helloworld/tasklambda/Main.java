package com.abc.helloworld.tasklambda;

public class Main {

	public static void main(String[] args) {
		Comparator<String> comparator = new Comparator<>("String Comparator");
		comparator.compare(5, 6, lower, equal, higher);
	}

	// wenn 5 < 6, soll eine Consolenausgabe nach der Art erfolgen:
	// String Comparator: is lower
	// wenn 5 == 6, soll eine Consolenausgabe nach der Art erfolgen:
	// String Comparator: is equal
	// wenn 5 > 6, soll eine Consolenausgabe nach der Art erfolgen:
	// String Comparator: is higher

	// -> ziel: nach einem Codeformatter sollen in dieser Klasse so wenig zeilen
	// code wie möglich genutzt werden, ohne dass gleichzeitig die lesbarkeit
	// negativ beeinträchtigt ist.

}

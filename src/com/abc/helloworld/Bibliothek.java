package com.abc.helloworld;

import java.util.ArrayList;

public class Bibliothek {
	private ArrayList arrayList;
	
	private void createBücher(int numberOfBooks, String title, String isbn){
		for (int i = 0; i < numberOfBooks; i = i + 1) {
			arrayList.add(new Buch(isbn, title));
		}
	}

	public Bibliothek(int bibliothekSize) {
		int i1 = 5, i2 = 3, i3=4;
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(i1);
		
		
		
		arrayList = new ArrayList();
		createBücher(4, "dasIstISBN", "Harry Potter");
		createBücher(1, "dasIstISBN1", "Das ist mein Title1");
		createBücher(1, "dasIstISBN2", "Das ist mein Title2");
		createBücher(1, "dasIstISBN3", "Das ist mein Title3");
		createBücher(2, "dasIstISBN4", "Das ist mein Title4");

		System.out.println("arrayList = " + arrayList);
		
		// arrayList.add(new Buch("dasIstISDN", "Das it mein Title"));
		// arrayList.add(new Buch("dasIstISDN", "Das it mein Title"));
		// arrayList.add(new Buch("dasIstISDN", "Das it mein Title"));
		// arrayList.add(new Buch("dasIstISDN", "Das it mein Title"));
		//
		// arrayList.add(new Buch("dasIstISDN1", "Das it mein Title1"));
		// arrayList.add(new Buch("dasIstISDN2", "Das it mein Title2"));
		// arrayList.add(new Buch("dasIstISDN3", "Das it mein Title3"));
		//
		// arrayList.add(new Buch("dasIstISDN4", "Das it mein Title4"));
		// arrayList.add(new Buch("dasIstISDN4", "Das it mein Title4"));

	}

	public static void main(String[] args) {
		Bibliothek bibliothek = new Bibliothek(10);
	}
}

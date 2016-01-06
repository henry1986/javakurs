package com.abc.helloworld.bibo2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Bibliothek {

	private Map<Long, Buch> map;

	public Bibliothek() {
		super();
		map = new HashMap<>();
		
		Buch buch = new Buch("hp1", 12456);
		map.put(buch.getIsbn(), buch);

		buch = new Buch("hp2", 254);
		map.put(buch.getIsbn(), buch);

		buch = new Buch("hp3", 3568);
		map.put(buch.getIsbn(), buch);
	}

	/**
	 * 
	 * @param isbn
	 * @return buch if found, null else
	 */
	public Buch getBuch(long isbn) {
		Buch buch = map.get(isbn);
		if (buch == null) {
			return null;
		}
		if (buch.isAusgeliehen()) {
			return null;
		}
		buch.setAusgeliehen(true);
		return buch;
	}

	public void rückgabe(Buch buch) {
		if (buch == null) {
			return;
		}
		buch.setAusgeliehen(false);
	}

	public static void main(String[] args) {
		Bibliothek bibliothek = new Bibliothek();

	}
}

package com.abc.helloworld;

public class Buch {
	private String isbn;
	private String title;
	private boolean ausgeliehen;

	public Buch(String isdn, String title) {
		this.isbn = isdn;
		this.title = title;
	}

	public boolean isAusgeliehen() {
		return ausgeliehen;
	}

	public void setAusgeliehen(boolean ausgeliehen) {
		this.ausgeliehen = ausgeliehen;
	}

	@Override
	public String toString() {
		return "Buch [title=" + title + "]";
	}

}

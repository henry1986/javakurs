package com.abc.helloworld.bibo2;

public class Buch {
	private final String title;
	private final long isbn;
	private boolean ausgeliehen;

	public Buch(String title, long isbn) {
		super();
		this.title = title;
		this.isbn = isbn;
	}

	public long getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public boolean isAusgeliehen() {
		return ausgeliehen;
	}

	public void setAusgeliehen(boolean ausgeliehen) {
		this.ausgeliehen = ausgeliehen;
	}

}

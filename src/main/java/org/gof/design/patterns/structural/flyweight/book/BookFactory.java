package org.gof.design.patterns.structural.flyweight.book;

import java.util.*;

public class BookFactory implements Factory {
	private List<java.lang.Character> as = new ArrayList<>();

	@Override
	public java.lang.Character createCharacter(char c, boolean upperCase) {
		return new java.lang.Character(c, upperCase);
	}

	@Override
	public Line createLine(int numberOfCharacters) {
		return new Line(numberOfCharacters);
	}

	@Override
	public Page createPage(int no, int numberOfLines) {
		// TODO Auto-generated method stub
		return new Page(no, numberOfLines);
	}

	@Override
	public Book createBook(String name, int numberOfPages) {
		return new Book(name, numberOfPages);
	}
}

package org.gof.design.patterns.behavioral.templateMethod.pattern;

public abstract class Document {
	protected String name;
	
	public Document(String name) {
		this.name = name;
	}

	abstract void open();
	
	abstract void read();
	
	abstract void save();
	
	abstract void close();

	public String getName() {
		return name;
	}
}

package org.gof.design.patterns.behavioral.visitor.file.problem1;

public abstract class File {
	protected String name;
	
	public File(String name){
		this.name = name;
	}
	
	public abstract void open();
	
	public abstract void read();
	
	public abstract void close();

}

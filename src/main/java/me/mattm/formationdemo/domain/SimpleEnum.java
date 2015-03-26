package me.mattm.formationdemo.domain;

import me.mattem.formation.annotations.FormationInclude;

@FormationInclude
public enum SimpleEnum {
	ONE("One", 1),
	TWO("Two", 2),
	THREE("Three", 3);
	
	private String name;
	public String getName(){ return name; }
	
	private int number;
	public int getNumber(){ return number; }
	
	private SimpleEnum(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	@Override
	public String toString(){ return this.name; }

}

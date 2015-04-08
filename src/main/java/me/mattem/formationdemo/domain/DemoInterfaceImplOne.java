package me.mattem.formationdemo.domain;

import me.mattem.formation.annotations.FormationInclude;

@FormationInclude(name="DemoInterfaceImplOne")
public class DemoInterfaceImplOne implements DemoInterface {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

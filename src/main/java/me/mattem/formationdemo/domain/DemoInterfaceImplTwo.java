package me.mattem.formationdemo.domain;

import me.mattem.formation.annotations.FormationInclude;

@FormationInclude(name="DemoInterfaceImplTwo")
public class DemoInterfaceImplTwo implements DemoInterface {
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

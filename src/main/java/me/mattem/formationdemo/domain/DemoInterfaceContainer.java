package me.mattem.formationdemo.domain;

import me.mattem.formation.annotations.FormationInclude;
import me.mattem.formation.annotations.FormationInterface;

@FormationInclude
public class DemoInterfaceContainer {

	private DemoInterface demoInterface;

	@FormationInterface(typeCategory="DemoInterface")
	public DemoInterface getDemoInterface() {
		return demoInterface;
	}

	public void setDemoInterface(DemoInterface demoInterface) {
		this.demoInterface = demoInterface;
	}
}

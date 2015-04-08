package me.mattem.formationdemo.domain;

public abstract class AbstractPojo {
	private boolean isFound = true;

	public boolean isFound() {
		return isFound;
	}

	public void setFound(boolean isFound) {
		this.isFound = isFound;
	}
}

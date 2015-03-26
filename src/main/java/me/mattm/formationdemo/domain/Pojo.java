package me.mattm.formationdemo.domain;

import java.util.List;
import java.util.Map;

import me.mattem.formation.annotations.FormationExclude;
import me.mattem.formation.annotations.FormationInclude;
import me.mattem.formation.annotations.FormationMap;

@FormationInclude(inherit=false)
public class Pojo extends AbstractPojo {
	
	// Simple types
	private String name;
	private int age;
	private Long shouldBeIgnored;
	private List<String> stringList;
	private Map<String, Long> stringLongMap;
	private boolean isEnabled;
	private SimpleEnum numbers;
	
	private Map<SimpleEnum, DemoInterfaceImplTwo> test;
	private List<Map<String, Integer>> complexListOfMaps;
	private Map<List<String>, List<Integer>> complexMapOfList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@FormationExclude
	public Long getShouldBeIgnored() {
		return shouldBeIgnored;
	}

	public void setShouldBeIgnored(Long shouldBeIgnored) {
		this.shouldBeIgnored = shouldBeIgnored;
	}

	public List<String> getStringList() {
		return stringList;
	}

	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}

	@FormationMap(keyLabel="Best Quote", valueLabel="Times Repeated")
	public Map<String, Long> getStringLongMap() {
		return stringLongMap;
	}

	public void setStringLongMap(Map<String, Long> stringLongMap) {
		this.stringLongMap = stringLongMap;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public SimpleEnum getNumbers() {
		return numbers;
	}

	public void setNumbers(SimpleEnum numbers) {
		this.numbers = numbers;
	}

	@FormationMap(keyLabel="Emily", valueLabel="Smells")
	public Map<SimpleEnum, DemoInterfaceImplTwo> getTest() {
		return test;
	}

	public void setTest(Map<SimpleEnum, DemoInterfaceImplTwo> test) {
		this.test = test;
	}

	public List<Map<String, Integer>> getComplexListOfMaps() {
		return complexListOfMaps;
	}

	public void setComplexListOfMaps(List<Map<String, Integer>> complexListOfMaps) {
		this.complexListOfMaps = complexListOfMaps;
	}

	public Map<List<String>, List<Integer>> getComplexMapOfList() {
		return complexMapOfList;
	}

	public void setComplexMapOfList(Map<List<String>, List<Integer>> complexMapOfList) {
		this.complexMapOfList = complexMapOfList;
	}

}

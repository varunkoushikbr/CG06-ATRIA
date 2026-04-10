package com.tnsif.scannerclassdemo;

public class Person {
	private String name;
	private int Income;
	private int Tax;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return Income;
	}
	public void setIncome(int income) {
		Income = income;
	}
	public int getTax() {
		return Tax;
	}
	public void setTax(int tax) {
		Tax = tax;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", Income=" + Income + ", Tax=" + Tax + "]";
	}
	
	

}

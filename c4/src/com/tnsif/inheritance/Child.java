package com.tnsif.inheritance;
//single level Iheritance
public class Child extends Parent {
	String cycle="pink";
	void read() {
		System.out.println("Java");
		
	}
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.money);
		System.out.println(c.car);
		System.out.println(c.cycle);
		c.drink();
		
	}

}

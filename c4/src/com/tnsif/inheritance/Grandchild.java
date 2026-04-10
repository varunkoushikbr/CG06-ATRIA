package com.tnsif.inheritance;

public class Grandchild extends Child {
	String toy="shoot";
	void read1() {
	System.out.println("Hello Grandchild");
	}
	
	public static void main(String[] args) {
		Grandchild G= new Grandchild();
		G.read();
		System.out.println(G.cycle);
		System.out.println(G.money);
		
	}
	
	

}

package com.tnsif.accessmodifierdemo;

public class Democlass2 {
	int a=9;
	private String s="Varun";
	
	public void display() {
		System.out.println("welcome");
		}
	public static void main(String[] args) {
		Democlass2 p=new Democlass2();
		System.out.println(p.a);
		System.out.println(p.s);
	p.display();
	}

}

package com.tnsif.accessmodifierdemo;

public class Democlass1 {
		int a=9;
		public String s="Varun";
		
		public void display() {
			System.out.println("welcome");
			}
		public static void main(String[] args) {
			Democlass1 p=new Democlass1();
			System.out.println(p.a);
			System.out.println(p.s);
		p.display();
		}
}

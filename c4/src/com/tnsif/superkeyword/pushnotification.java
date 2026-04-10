package com.tnsif.superkeyword;

public class pushnotification extends notification {
	String mes="push notification";
	void read() {
		System.out.println("not Reading");
	}
	
	void dis() {
		System.out.println("child " + mes);
		System.out.println("parent " + super.mes);
		read();
		super.read();
		
		
	}
	public static void main(String[] args) {
		pushnotification p=new pushnotification();
		p.dis();
		
	}

}

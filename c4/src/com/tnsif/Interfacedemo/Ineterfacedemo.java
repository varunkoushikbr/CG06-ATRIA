package com.tnsif.Interfacedemo;


interface Smartdevices{
	void turnOn();
	void turnOff();
	void getStatus();
	
}
class Smartlight implements Smartdevices{

	@Override
	public void turnOn() {
		System.out.println("Smart light On:");// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		System.out.println("Smart light Off:");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getStatus() {
		System.out.println("smart light is on standy mode");
		// TODO Auto-generated method stub
		
	}
	
}

public class Ineterfacedemo {

	public static void main(String[] args) {
		Smartlight s = new Smartlight();
		s.turnOff();
		s.turnOff();
		s.getStatus();
	}
}

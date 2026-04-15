package com.tnsif.Interfacedemo;
interface Game{
	void play();
}

class Guess implements Game{

	@Override
	public void play() {
		System.out.println("Playing game:");
		
	}
	
}

public class FunctionalInterface {
	public static void main(String[] args) {
		Guess g=new Guess();
		g.play();
	}

}

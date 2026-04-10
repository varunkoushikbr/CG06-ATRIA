package com.tnsif.finalkeyworddemo;
 final class Ecommerceplatform{
	final void calculate() {
		System.out.println("base discount 10%");
	}
}
class Amazon extends Ecommerceplatform{
	@Override
	void calculate() {
		System.out.println("base discount 20%");
	}
	
}

public class Finalmethod {
	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.calculate();
		
	}
	

}

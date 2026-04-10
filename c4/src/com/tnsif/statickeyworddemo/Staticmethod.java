package com.tnsif.statickeyworddemo;

class Paymentgateway{
	static void shownotification() {
		System.out.println("Supported bank: SBI, Axis, ...");
	}
}
public class Staticmethod {
	public static void main(String[] args) {
		Paymentgateway.shownotification();
	}
}


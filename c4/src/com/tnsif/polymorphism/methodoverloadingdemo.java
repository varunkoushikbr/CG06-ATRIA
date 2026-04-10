package com.tnsif.polymorphism;
class Demo{
	double add(double a,double b){
		return a+b;
		
	}
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
}

public class methodoverloadingdemo { 
	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println(d.add(1,3));
		System.out.println(d.add(10.3,6.3));
		System.out.println(d.add(1, 2,3));
	}

}

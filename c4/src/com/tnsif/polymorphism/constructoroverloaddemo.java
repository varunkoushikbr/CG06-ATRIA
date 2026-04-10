package com.tnsif.polymorphism;
class constructoroverload{
	constructoroverload(){
		System.out.println("Chai");
	}
	constructoroverload(int a, int b){
		int c=a+b;
		System.out.println("result:"+c);
		
	}
}

public class constructoroverloaddemo {
	public static void main(String[] args) {
		constructoroverload c=new constructoroverload();
		
		System.out.println(c instanceof constructoroverload);
		System.out.println();
	}

}

package com.tnsif.constructordemo;

public class ConExample {
	
	ConExample(){
		System.out.println("Default con");
		
	}
	ConExample(int r){
		System.out.println("1 para");
	}
	ConExample(int a,String b){
		System.out.println("2 para");
	}
	ConExample(int s,int b,int d){
		System.out.println("3 para");
	}
	public static void main(String[] args) {
		ConExample c=new ConExample();
		ConExample c1=new ConExample(9);
		ConExample c2=new ConExample(1,"good");
		ConExample c3=new ConExample(5,6,7);
	}
}

package com.tnsif.Interfacedemo;

import java.util.Scanner;

public class Odevdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if (n%2==0){
			System.out.println("the given number "+n+" is even");
		}
		else {
			System.out.println("The given number "+n+" is odd");
		}
	}

}

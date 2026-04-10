package com.tnsif.statickeyworddemo;

class Student{
	String name;
	int id;
	static String collegename="Atria";
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	void showdetails() {
		System.out.println("Student"+name +" id "+id+" collegename "+collegename);
	}
}

public class Staticvariabledemo{
		public static void main(String[] args) {
			Student s1=new Student("guru",2);
			s1.showdetails();
		
		
	}
	

}

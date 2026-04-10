package com.tnsif.example1;

public class Student {
	private int USN;
	private String Name;
	private int Percent;
	public int getUSN() {
		return USN;
	}
	public void setUSN(int uSN) {
		USN = uSN;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPercent() {
		return Percent;
	}
	public void setPercent(int percent) {
		Percent = percent;
	}
	@Override
	public String toString() {
		return "Student [USN=" + USN + ", Name=" + Name + ", Percent=" + Percent + "]";
	}
	

}

package com.java.Constructors;

public class Student {
	//fields
	String name;
	int roll_no;
	int yop;
	
	//constructor
	public Student(String name, int roll_no, int yearpass) {
		this.name = name;
		this.roll_no = roll_no;
		yop = yearpass;
		
	}


	public static void main(String[] args) {
		Student s = new Student("priya", 20 , 2026);
		System.out.println(s.name);
		System.out.println(s.roll_no);
		System.out.println(s.yop);
		
	}

}


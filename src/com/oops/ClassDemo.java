package com.oops;
/*
 * oop:  object oriented programming
 * 1.way to organize code
 * adv:
 * less code redundancy
 * code re usability
 * data security
 * 
 * 1.class: 
 * class is a collection data member and member function
 * 2.object: 
 * object gives permission to access functionality of class
 * 3.inheritance 
 * 4.encapsulation
 * 5.polymorphism
 * 6.abstraction
 */
class Student{
	int id;
	String name;
	
	public void setData(int roll_name,String s_name) {
		id=roll_name;
		name=s_name;
	}
	public void displayData() {
		System.out.println("id is :"+id);
		System.out.println("name is :"+name);
	}
}
/*
 * class program 1.Assign and print the roll number, 
 * phone number and address of two students
 *  having names "Sam" and "John" 
 *  respectively by creating two objects of the class 'Student'.
 */
public class ClassDemo {
public static void main(String[] args) {
	//class_name obj_name=new class_name();
	Student s1=new Student(); 
	Student s2=new Student(); 
	s1.setData(123,"sam");
	s2.setData(124,"john");
	/*
	 * java does not support garbage value
	 */
	s1.displayData();
	s2.displayData();
	
}
}

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
	
	public void setData() {
		id=123;
		name="roshan";
	}
	public void displayData() {
		System.out.println("id is :"+id);
		System.out.println("name is :"+name);
	}
}
public class ClassDemo {
public static void main(String[] args) {
	//class_name obj_name=new class_name();
	Student s1=new Student(); 
	s1.setData();
	/*
	 * java does not support garbage value
	 */
	s1.displayData();
	
}
}

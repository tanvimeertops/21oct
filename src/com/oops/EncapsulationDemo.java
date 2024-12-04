package com.oops;
/*
 * encapsulation: 
 * wrapping of data (to secure the data)
 * access specifier: use with class,function,variable
 * private: only accessible within a class
 * protected :only accessible in child class
 * default: accessible within package
 * public: accessible anywhere
 */
 class Employee{
	private int id;
	protected String emp_name;
	
	public void setData() {
		id=123;
		emp_name="tapan";
		System.out.println("id is: "+id);
	}
	}
class Salary extends Employee{
	int salary=565875;
	public void show() {
//		System.out.println("id is :"+id);
		System.out.println("name is :"+emp_name);
		System.out.println("salary is :"+salary);
	}
}
class Demo{
	public void display() {
//		System.out.println("name is :"+emp_name);
	}
}
public class EncapsulationDemo {
public static void main(String[] args) {
	Salary s1=new Salary();
	s1.setData();
	s1.show();
}
}

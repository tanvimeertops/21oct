package com.keyword;
/*
 * Interface: 
 * 1.same as class but we cannot create object of interface
 * 2.interface contains only data member and member function
 * 3.all data member are final by default
 * 4.all member function are abstract by default
 * 5.use "implements" keyword to inherit into some other class
 * 6.main purpose is to solve the problem of multiple inheritance
 * 7.can implement multiple interface using ,
 */
class Result{
	String grade="A+";
}
class Demo456 extends Result implements IDemo {

	@Override
	public void show() {
		System.out.println("roll no is: "+roll_no);
		System.out.println("Result is :"+grade);
		System.out.println("id is :"+id);
	}
	
}
public class InterfaceDemo {
public static void main(String[] args) {
	Demo456 dm=new Demo456();
	dm.show();
}
}

package com.keyword;

/*
 * Final : constant at value side
 * variable : 
 * 1. must assign value at the time declaration
 * 2.cannot change value at compile or runtime
 * method :opp of abstract method
 * class :opp of abstract class
 */
final class FDemo{
	final int roll_no=13;
	String name;
	
	public final void setData() {
		
		name="pratik";
	}
	public void show() {
		System.out.println("roll no :"+roll_no);
		System.out.println("name :"+name);
	}
}
//class Demo extends FDemo{
//	
//
//}
public class FinalDemo {
public static void main(String[] args) {
	FDemo f1=new FDemo();
	f1.setData();
	f1.show();
}
}

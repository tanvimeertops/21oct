package com.keyword;
/*
 * Static: Constant at memory side
 * 
 * use with variable : opp of final
 * 
 * use with method : 
 * 1.static method can have only static variable
 * 2.all variables are static by default
 * 3.static method are called without object
 * (with class name)
 */

class SDemo{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	int no;
	static int s;
	
	public static void show() {
		s=46;
		System.out.println("s is :"+s);
		int r_no=67;
		System.out.println("r no is :"+r_no);
	}
}
public class StaticDemo {
public static void main(String[] args) {
	SDemo s1=new SDemo();
	SDemo s2=new SDemo();
	SDemo s3=new SDemo();
	
	SDemo.show();
	
	s1.no=1; //4
	s2.no=2; //4
	s3.no=3; //4
	
	SDemo.s=10;
	s2.s=20;  //4
	s3.s=30;
	
	
	System.out.println("variable val:"+s1.no);
	System.out.println("variable val:"+s2.no);
	System.out.println("variable val:"+s3.no);
	
	System.out.println("static variable val:"+s1.s);
	System.out.println("static variable val:"+s2.s);
	System.out.println("static variable val:"+s3.s);
}
}

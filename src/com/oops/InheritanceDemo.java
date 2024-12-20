package com.oops;
/*
 * Inheritance : deriving a attribute from another 
 * class
 * -->object will be made for last child only
 * --> java does not directly support multiple inheritance
 * --> Use "extends" keyword to inherit a class
 * adv: 
 * 1.less object creation
 * 2.code re usability
 * types:
 * Single :one parent one child
 * Multilevel : one grandparent one parent one child
 * Multiple: multiple parent single child
 * Hierarchical :one parent multiple child
 * Hybrid : combination of any two
 * 
 */

class Student1{
	int roll_no;
	String name;
	
	public void setStudent() {
		roll_no=1;
		name="roshan";
	}
}

class Exam extends Student1 {
	String percentage;
	
	public void setData() {
		percentage="First Class";
	}
	
	
}

class Sports extends Exam{
	int sports_marks=23;
	public void display() {
		System.out.println("roll no is: "+roll_no);
		System.out.println("name is: "+name);
		System.out.println("percentage is :"+percentage);
		System.out.println("sports marks is :"+sports_marks);
	}
}
public class InheritanceDemo {
public static void main(String[] args) {
//	Exam e1=new Exam();
	Sports s1=new Sports();
	s1.setStudent();
	s1.setData();
	s1.display();
}
}

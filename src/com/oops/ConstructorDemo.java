package com.oops;
/*
 * Constructor : it is a special member "function" which is
 * initializes by its own
 * 
 * 1.same name as class name
 * 2.no return type
 * 3.it is invoked automatically whenever object is created 
 * 
 * types of constructor
 * 1.Default (without parameter)
 * 2.Parameterized (with parameter)
 * 3.Copy constructor (object as parameter) clone the object 
 * constructor overloading 
 */
//1.Default (without parameter)
class Box{
	double length,width,depth;
	
	public Box() {
		System.out.println("In Default Constructor");
		length=1;
		width=2;
		depth=3;	
	}
	
	public Box(double l,double w,double d) {
		System.out.println("In Parameter Constructor");
		length=l;
		width=w;
		depth=d;	
	}
	
	public Box(Box b) {
		System.out.println("In Copy Constructor");
		length=b.length;
		width=b.width;
		depth=b.depth;	
	}
	public void volOfBox() {
		System.out.println("volume of box is : "
	+(length*width*depth));
	}
	
}
public class ConstructorDemo {
public static void main(String[] args) {
	Box dc=new Box();
	dc.volOfBox();
	Box pc=new Box(100,200,300);
	pc.volOfBox();
	Box cc=new Box(pc);
	cc.volOfBox();
}
}

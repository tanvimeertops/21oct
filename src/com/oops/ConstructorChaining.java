package com.oops;
/*
 * polymorphism :
 * 1.compile time
 * function overloading
 * 2.run time 
 * function overriding: same function name,same return type,same
 * parameter (same prototype)
 * 
 * super : call overridden function of immediate parent
 */

class A{
	public A() {
		System.out.println("In Constructor A");
	}
	
	public void show() {
		System.out.println("In show A");
	}
}
class B extends A{
	public B() {
		System.out.println("In Constructor B");
	}
	public void show() {
		super.show();
		System.out.println("In show B");
	}
}
class C extends B{	
	public C() {
		System.out.println("In Constructor C");
	}
	public void show() {
		super.show();
		System.out.println("In show C");
	}
}
public class ConstructorChaining {
public static void main(String[] args) {
	C c=new C(); 
	c.show();
	
}
}

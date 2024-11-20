package com.oops;
/*
 * Function : Function Does Something 
 * types
 * function without parameter and without return type
 * function with parameter and without return type
 * function without parameter and with return type
 * function with parameter and with return type
 * 
 * Polymorphism:one name multiple form
 * 
 * function overloading : 
 * same function name but different parameter
 * function overriding : 
 * same function name with same prototype
 */
class Calc{
	int num1=10,num2=20;
	//function without parameter and without return type
	public void sum() {
		System.out.println("sum is :"+(num1+num2));
	}
	//function with parameter and without return type
	public void sum(int num1,int num2) {
		System.out.println("sum is :"+(num1+num2));
	}
	//function without parameter and with return type
	public int mul() {
		return (num1*num2);
	}
	// function with parameter and with return type
	public int mul(int num1,int num2) {
		return (num1*num2);
	}
	
}
public class FunctionDemo {
public static void main(String[] args) {
	Calc c1=new Calc();
	c1.sum();
	c1.sum(100, 200);
	System.out.println("mul is :"+c1.mul());
	System.out.println("mul is :"+c1.mul(6,3));
}
}

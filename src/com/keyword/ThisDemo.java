package com.keyword;
/*
 * This : this keyword is used to give the current class
 * reference 
 * 
 * if instant variable name is same as a parameter this 
 * keyword is use with the class variable
 */

class TDemo{
	int num1,num2; //class/instant/global variable
	
	public void sum(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
		System.out.println("sum is :"+(num1+num2));
	}
	public void display() {
		System.out.println("num is :"+num1);
		System.out.println("num is :"+num2);
	}
	
}
class Demo123 extends TDemo{
	public void show() {
		System.out.println("num 1 :"+num1);
		System.out.println("num 2 :"+num2);
	}
	
}
public class ThisDemo {
public static void main(String[] args) {
	Demo123 td=new Demo123();
	td.sum(34, 56);
	td.show();
	td.display();
}
}

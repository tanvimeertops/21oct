package com.basics;
/*
 * greatest of three number
 *  nested if
 *  else if ladder
 *  logical operator
 *  && || !
 */
public class ConditionDemo2 {
public static void main(String[] args) {
//	int a=1000,b=200,c=3000;
	
//	if(a>b) {
//		if(a>c) {
//			System.out.println("a is greater");
//		}else {
//			System.out.println("c is greater");
//		}
//	}else {
//		if(b>c) {
//			System.out.println("b is greater");
//		}else {
//			System.out.println("C IS GREATER");
//		}
//	}
	
	int a=1000,b=2000,c=300;
	if (a>b && a>c) {
		System.out.println("a is greater");
	}else if (b>a && b>c) {
		System.out.println("b is greater");
	}else {
		System.out.println("c is greater");
	}
	
	
	/*
	 * per>=75  "Distinction"
	 * per>=60  "First class"
	 * per>=50  "Second class"
	 * per>=35  "Third class"
	 * 			"fail"
	 */
	int percentage=32;
	if(percentage>=75) {
		System.out.println("Distinction");
	}else if (percentage>=60) {
		System.out.println("First Class");
	}else if (percentage>=50) {
		System.out.println("Second Class");
	}else if (percentage>=35) {
		System.out.println("Third Class");
	}else {
		System.out.println("Fail");
	}
	
}
}

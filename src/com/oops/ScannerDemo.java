package com.oops;

import java.util.Scanner;

/*
 * Scanner :
 * it is a class
 * main purpose is to take input from the keyboard
 * it uses System.in as a parameter
 * 
 * data type        Function
 * int              nextInt()
 * float			nextFloat() 
 * Char				next().charAt(0)
 * 
 * String 
 * next() : it is used for single word
 * it reads word upto space
 * Roshan Gupta
 * nextLine() :it is used for whole sentence
 * it reads word upto enter
 * 
 */
public class ScannerDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	
	float a,b;
	System.out.println("Enter First Value: ");
	a=sc.nextFloat();
	System.out.println("Enter Second Value: ");
	b=sc.nextFloat();
	
	System.out.println("sum is :"+(a+b));
	
	String name;
	System.out.println("enter your name: ");
//	name=sc.next();
	//to clean buffer
//	sc.nextLine();
	name=sc1.nextLine();
	System.out.println("name is :"+name);
}
}

package com.oops;

import java.util.Scanner;

/*
 * Array :multiple value with same type
 * .always start with 0
 * .size is length-1
 * 
 * types
 * Single Dimension
 * 2D Array
 * jagged array
 */
public class ArrayDemo {
public static void main(String[] gfgfdg) {
//	int a[]=new int[5];
	int[] a=new int[4];
	
	for (int i = 0; i < a.length; i++) {
		a[i]=i+1;
		System.out.println(a[i]);
	}
	
	Scanner sc=new Scanner(System.in);
	
	for (int i = 0; i < a.length; i++) {
		System.out.println("enter a value: ");
		a[i]=sc.nextInt();
	}
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}

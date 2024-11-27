package com.oops;

import java.util.Scanner;

public class ArrayDemo2 {
public static void main(String[] args) {
	int[][] a=new int[3][3];
	int[][] b=new int[3][3];
	int[][] c=new int[3][3];
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("For a");
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.println("enter a value");
			a[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("For b");
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b.length; j++) {
			System.out.println("enter a value");
			b[i][j]=sc.nextInt();
		}
	}
	
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b.length; j++) {
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	
	System.out.println("sum is :");
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c.length; j++) {
			System.out.print("  "+c[i][j]);
		}
		System.out.println();
	}
}
}

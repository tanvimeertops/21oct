package com.oops;

import java.util.Scanner;

/*
 * Jagged Array :same as 2d array but no of col is not
 * fixed 
 * 
 * 1 2 3 4 5
 * 1 2 3
 * 1
 * 1 2 3 4
 */
public class JaggedArray {
public static void main(String[] args) {
	int row;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of row");
	row=sc.nextInt();
	
	
	int[][] a=new int[row][];
	
	for (int i = 0; i < a.length; i++) {
		System.out.println("enter no of col is row no :"+i+":");
		
		a[i]=new int[sc.nextInt()];
		
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.println("enter value for a["+i+"]["+j+"]:");
			a[i][j]=sc.nextInt();
		}
	}
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(" "+a[i][j]);
		}
		System.out.println();
	}
}
}

package com.basics;
/*
 * Loop: Iterative,repetitive
 * types of loop:
 * entry control:
 * for loop
 * syn:
 * for(initialization;condition;incree/decree)
 * while loop
 * initialization;
 * while(condition){
 * print
 * incree/decree
 * }
 * exit control:
 * do while
 * initialization
 * do{
 * print
 * incree/decree
 * }while(condition)
 * 
 */
public class LoopingDemo1 {
public static void main(String[] args) {
	
//	for(int i=1;i<=5;i++) {  //6
//		System.out.println(i);//5
//	}
	
	// 11 times no of line executed
	
//	int i=1; //1
//	
//	while (i<=5) { //6
//		System.out.println(i); //5
//		i++;//5
//	}
	// 17 times no of line executed
	
	int i=1; //1
	do {   
		System.out.println(i);
		i++;
	} while (i<=5); 
	
	// 21 times no of line executed
}
}

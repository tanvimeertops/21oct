package com.exception;
/*
 * Exception :any abnormal condition
 * Exception is a root class for all types of exception
 * Error: 
 * 1.compile time error 
 * 		syntax error, ,; missing
 * 2.run time error
 * 		NullPointerException
 * 		ArrayIndexOutOfBoundsException
 * 		ArithmeticException
 * 
 * 3.error
 * 		programmer mistake
 * 
 * keyword for exception:
 * try:to find a error from the code
 * 1.if we have doubt any code will have error put that code
 * inside try block
 * 2.the code from that line will be skipped and rest of 
 * the code will be executed 
 * 3.try must be followed by catch or finally or both
 * 4.it throws error to catch		
 * catch: 
 * 	whenever error is thrown by the try block catch handles
 * the exception
 * 
 * finally: 
 * whether error is there or not finally code will be
 * executed
 * 
 * throw
 * throws
 */
public class ExceptionDemo {
public static void main(String[] args) {
//int[] a=new int[4];
//	
//	for (int i = 0; i <=a.length; i++) {
//		try {
//			a[i]=i+1;
//			System.out.println(a[i]);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//			
//			System.out.println("this code is wrtten by tanvi");
//			System.out.println("contact 3434343 for query");
//		
//		
//	}
	
	int num1=23,num2=0,num3;
	
	try {
		num3=num1/num2;
		System.out.println("div is :"+num3);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	finally {
		System.out.println("this is division code");
	}
	
}
}

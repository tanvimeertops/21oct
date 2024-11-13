package com.basics;

public class FirstDemo {
public static void main(String[] args) {
	int first_value=2147483647; //4 byte
	long l1=3434343443434l; // 8 
	char ch='a';//2
	boolean bb=true; //1 bit
	byte b1=127;//1 byte
	float f1=1223.4545f;//4 
	double d1=343434.56565;//8
	
	System.out.println("int value is :"+first_value);
	System.out.println("long is :"+l1);
	System.out.println("char is :"+ch);
	
	System.out.println("boolean is :"+bb);
	System.out.println("float is :"+f1);
	System.out.println("byte is :"+b1);
	System.out.println("double is :"+d1);
	
	System.out.println("size of int is :"+Integer.BYTES +" bytes");
	System.out.println("size of float is :"+Float.BYTES +" bytes");
	System.out.println("size of byte is :"+Byte.BYTES +" bytes");
	
	
}
}

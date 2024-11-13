package com.basics;
/*
 * Type casting : conversion of one primitive data type
 * into another
 * 
 * 1.implicit conversion: automatic converted
 * small size data type to large size data type
 * long l1= int i1;
 * 2.explicit conversion: 
 * large size data type to small size data type
 * int i1=long l1
 */
public class TypeCastingDemo {
public static void main(String[] args) {
	int i1=123;
	long l1=i1;
	
	System.out.println("implicit conversion is :"+l1);
	int i2=(int)l1;
	System.out.println("explicit conversion is :"+i2);
	
	int i4=127;
	byte b1=(byte) i4;  //-128 -127 -126 to 127
	System.out.println("explicit conversion is :"+b1);
	
	char ch='?'; //2
	int i5=ch; //4
	
	System.out.println("char is :"+i5);
}
}

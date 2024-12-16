package com.cmn_class;
/*
 * String :string is immutable
 * 
 * String Buffer
 * Wrapper
 * Object
 */
public class StringDemo {
public static void main(String[] args) {
	String s1=new String("This is Tops Technologies...");
	
	System.out.println("original length :"+s1.length());
	System.out.println("original String :"+s1);
	
	System.out.println("string to lower case :"+s1.toLowerCase());
	System.out.println("string to upper case :"+s1.toUpperCase());
	System.out.println("string to substring :"+s1.substring(2));
	System.out.println("string to substring :"+s1.substring(2,5));
	
	if(s1.equalsIgnoreCase("this is Tops Technologies...")) {
		System.out.println("both strings are same");
	}else {
			System.out.println("both strings are diff");
	}
	
	System.out.println("original length :"+s1.length());
	System.out.println("original String :"+s1);
}
}

package com.cmn_class;
/*
 * String Buffer: it is mutable
 * 
 */
public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer s1=new StringBuffer("This is Tops Technologies...");
	
	System.out.println("original length :"+s1.length());
	System.out.println("original String :"+s1);
	
	s1.append("tanvi");
	System.out.println("original length :"+s1.length());
	System.out.println("original String :"+s1);
	
	s1.insert(0, "Hii ");
	System.out.println("original length :"+s1.length());
	System.out.println("original String :"+s1);
	
	s1.delete(0, 4);
	System.out.println("original length :"+s1.length());
	System.out.println("original String :"+s1);
	
	s1.reverse();
	System.out.println("original length :"+s1.length());
	System.out.println("original String :"+s1.reverse());
	
	s1.replace(0,4, "Welcome");
	System.out.println("original length :"+s1.length());
	System.out.println("original String :"+s1);
}
}

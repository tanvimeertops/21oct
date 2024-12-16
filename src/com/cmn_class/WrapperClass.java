package com.cmn_class;

import javax.swing.plaf.synth.SynthScrollPaneUI;

/*
 * Wrapper class : conversion of non primitive datatype
 * to primitive datatype and vice a versa
 *
 *data type		Wrapper class
 * int 			Integer
 * long			Long
 * 
 * 1.AutoBoxing: convert automatically
 * 2.Boxing: value first given to variable to object
 * 3.Unboxing:object to variable, now object value is given
 * to primitive type before it was not possible
 * 
 * 
 */
public class WrapperClass {
public static void main(String[] args) {
	String s1=new String("This is Tops Technologies...");
	
	System.out.println("auto boxing is :"+s1);
	
	Integer i1=new Integer(100);
	System.out.println("auto boxing is :"+i1);
	
	int i2=150;
	Integer i3=new Integer(i2);
	System.out.println("Boxing is: "+i3);
	
	int i4=i1;
	
	System.out.println("Un boxing is :"+i4);
	
	String val1="10";
	String val2="786";
	
	int i5=Integer.valueOf(val1);
	int i6=Integer.valueOf(val2);
	
	
	System.out.println("sum is :"+(i5+i6));
	
	String s2=String.valueOf(i2);
	System.out.println("String val is :"+s2);
}
}

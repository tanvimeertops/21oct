package com.basics;
/*
 * Loop : iterative,repetitive
 *  adv :less code redundant,less time and space complexity
 *  types of loop:
 *  entry control : 
 *   for (initialization;condition;incree/decree)
 *   
 *   initialization;
 *   while(condition)
 *   {
 *   statement
 *   incree/decree
 *   }
 *  exit control
 *  
 *  do 
 *  while
 * 	initialization;
 * 	do{
 * statement
 * incree/decree
 * }while(condition);
 */
public class LoopingDemo {
public static void main(String[] args) {
	
//	for (int i = 1; i <=5; i++) {//6
//		System.out.println(i);//5
//	}
	//11 number of lines executed in the loop
	
	
//	int i=1;  //1
//	while (i<=5) { //6
//		System.out.println(i);//5
//		i++;//5
//	}
	//17 number of lines executed in the loop
	
	
	int i=1;//1
	do { //3
		System.out.println(i);//5
		i++;//4
	} while (i<=5);//4
	
	//17 number of lines executed in the loop
}
}

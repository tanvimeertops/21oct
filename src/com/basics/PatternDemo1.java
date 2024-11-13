package com.basics;
/*
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * for i: 
 * initialization
 * first no in the pattern
 * 
 * condition
 * last no of loop
 * 
 * min to max : <=
 * max to min : >=
 * 	
 * incree/decree
 * 
 * <= , ++
 * >= , --
 * for j:
 * initialization
 * first col of each row
 * same no :that no only
 * diff no :upper loop var name
 * 
 * condition
 * last no of each row
 * same no :that no only
 * diff no :upper loop var name
 * 
 * 
 * min to max : <=
 * max to min : >=
 * 	
 * incree/decree
 * 
 * <= , ++
 * >= , --
 * 
 */
public class PatternDemo1 {
public static void main(String[] args) {
	/*
	 * +++++1
	 * ++++12
	 * +++123
	 * ++1234
	 * +12345
	 * 
	 * for k
	 * completely depends on i
	 */
	
	for (int i = 1; i <=5; i++) { //row
		for (int k = i; k <=5; k++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=i; j++) { //col
			System.out.print(j);
		}
		System.out.println();
	}
	
	/*
	 * 1
	 * 21
	 * 321
	 * 4321
	 * 54321
	 */
	
//	for (int i = 1; i <=5; i++) { //row
//		for (int j = i; j >=1; j--) { //col
//			System.out.print(j);
//		}
//		System.out.println();
//	}
	
	/*
	 * 5
	 * 45
	 * 345
	 * 2345
	 * 12345
	 * 
	 * 5
	 * 54
	 * 543
	 * 5432
	 * 54321
	 * 
	 * 1
	 * 10
	 * 101
	 * 1010
	 * 10101
	 */
	
	
}
}

package com.basics;
/*
 * +++++1
 * ++++12
 * +++123
 * ++1234
 * +12345
 * 
 * for i :
 * initialization:
 * first value of pattern
 * condition
 * last value of pattern
 * 
 * check first and last value
 * min to max: <=
 * max to min: >=
 * 
 * incree/decree
 * <=  ++
 * >=  --
 * 
 * for j :
 * initialization:
 * first col of each row
 * same no: that no only
 * diff no: upper loop name
 * condition
 * last col of each row
 * same no: that no only
 * diff no: upper loop name
 * 
 * check each row
 * min to max: <=
 * max to min: >=
 * 
 * incree/decree
 * <=  ++
 * >=  --
 * 
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
 * 21
 * 321
 * 4321
 * 54321
 * 
 * +++++1
 * ++++12
 * +++123
 * ++1234
 * +12345
 * 
 * for k:
 * same as i 
 * 
 *      1
 *     1 2
 *    1 2 3
 *   1 2 3 4
 *  1 2 3 4 5
 *  
 *  	*
 *     ***
 *    *****
 *     ***
 *      *
 * 
 */
public class PatternDemo {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		for (int k = i; k<=5; k++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=i; j++) {
			System.out.print(" "+j);
		}
		System.out.println();
	}
}
}

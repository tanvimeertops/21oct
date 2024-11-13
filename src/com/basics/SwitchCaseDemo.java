package com.basics;
/*
 * Switch Case
 */
public class SwitchCaseDemo {
public static void main(String[] args) {
	
	int choice=2;
	
	switch (choice) {
	case 1:
		System.out.println("Fan is on");
		break;
	case 2:
		System.out.println("Light is on");
		break;
	case 3:
		System.out.println("AC is on");
		break;
	default:
		System.out.println("Invalid Choice");
		break;
	}
	
	/*
	 * Vowel and Consonant
	 * Vowel : a e i o u
	 */
	
	char ch='y';
	switch (ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println("Vowel");
		break;

	default:
		System.out.println("Consonant");
		break;
	}
	
}
}

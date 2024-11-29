package com.oops;

import java.util.Scanner;

class Bank{
	String acc_holder_name;
	double balance=50000;
	
	public void setAccData() {
		acc_holder_name="pratik";
	}
	public void display() {
		System.out.println("Hello "+acc_holder_name);
	}
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("Amount Deposited is: "+amount+""
				+ "updated balance is :"+balance);
	}
	
	public void withDraw(double amount) {
		balance-=amount;
		System.out.println("Amount Withdrawn is: "+amount+""
				+ "updated balance is :"+balance);
	}
}

class SavingAcc extends Bank {
	double interest,interest_rate=5;
	
	
	
	public void calInterest() {
		interest= balance*(interest_rate/100);
		balance+=interest;
		System.out.println("your interest amount is :"+interest);
		System.out.println("After interest total"
				+ " balance is: "+balance);
	}
	
	

}
public class SingleInheritance {
public static void main(String[] args) {
	SavingAcc sa=new SavingAcc();
	sa.setAccData();
	sa.display();
	
	Scanner sc=new Scanner(System.in);
	double amount;
	
	System.out.println("Enter the amount to be Deposited");
	amount=sc.nextDouble();
	
	sa.deposit(amount);
	
	System.out.println("Enter the amount to be WithDrawn :");
	amount=sc.nextDouble();
	
	sa.withDraw(amount);
	
	sa.calInterest();
}
}

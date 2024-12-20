package com.exception;

import java.util.Scanner;

/*
 *Banking :
 *Deposit: 
 *
 *Withdraw:
 *balance>=amount
 *5000   2000
 *balance<=amount
 *2000   5000
 *if you deposit 3000 rs you can withdraw 5000 rs
 *
 *
 *throw:
 *1.inside method we write throw
 *2.throw followed by new keyword as well as constructor
 *3.must inherit Exception class into user defined class
 *then it is known as user defined exception
 *4.must be used with user defined exception
 *
 * throws
 * 1.after method declaration we write throws
 * 2.we can inherit user defined as well system defined exception 
 * class
 * 3.multiple class separated by ,
 */
class TanviException extends Exception{
	double amount;
	public TanviException(double amount) {
		this.amount=amount;
	}
	
}
class Bank{
	double amount,balance=1000;
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("you have deposited "+amount+ " rs "
				+ "your balance is : "+balance);
	}
	
	public void withdraw(double amount) throws TanviException,ArithmeticException {
		if(amount<=balance) {
			balance-=amount;
			System.out.println("you have withdrawn "+amount+ " rs "
					+ "your balance is : "+balance);
		}else {
		double needs=amount-balance;
			throw new TanviException(needs);
		}
		
	}
}
public class UserDefinedException {
public static void main(String[] args) {
	Bank b=new Bank();
	Scanner sc=new Scanner(System.in);
	double amount;
	System.out.println("Enter the amount to be Deposited: ");
	
	amount=sc.nextDouble();
	b.deposit(amount);
	
	System.out.println("Enter the amount to be withdrawn: ");
	
	amount=sc.nextDouble();
	try {
		b.withdraw(amount);
	} catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (TanviException e) {
		// TODO Auto-generated catch block
		System.out.println("if you deposit "+e.amount+" rs you can withdraw"+amount+" rs");
	}
}
}

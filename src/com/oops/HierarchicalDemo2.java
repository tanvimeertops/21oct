package com.oops;

class MothlySaving{
	double total_saving;
	
	public void CalculateSaving(double initial_amount,
			double month,double mothly_deposit ) {
		total_saving=initial_amount+(month*mothly_deposit);
	}
}

class StudentA extends MothlySaving{
	String name="Pratik";
	
	public void show() {
		CalculateSaving(10000, 5, 5000);
		System.out.println("hello my name is :"
	+name+"my total saving is :"+total_saving);
	}
}

class StudentB extends MothlySaving{
	String name="Roshan";
	
	public void show() {
		CalculateSaving(5000, 25, 2000);
		System.out.println("hello my name is :"
	+name+"my total saving is :"+total_saving);
	}
}

public class HierarchicalDemo2 {
public static void main(String[] args) {
	StudentA a=new StudentA();
	StudentB b=new StudentB();
	
	a.show();
	b.show();
}
}

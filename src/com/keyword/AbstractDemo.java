package com.keyword;
/*keyword: 
 * 1.Super
 * 2.Abstract
 * 3.final
 * 4.this
 * 5.interface
 * 6.static
 * 
 * Abstraction:Hiding details Show only essential info
 * 
 * abstraction is use with class and method
 * use with class :
 * 1.abstract class cannot have object
 * 2.must inherit into some other class
 	use with method: 
 	1.Abstract methods do not specify a body
 	2.must override into child class
 	3.The abstract method can only be defined by an 
 	abstract class
 */

abstract class ADemo{
	int emp_id;
	String emp_name;
	
	public abstract void setData();
	
}

class Demo extends ADemo{
	public void setData() {
		emp_id=345;
		emp_name="drishti";
	}
	
	public void show() {
		System.out.println("emp id is :"+emp_id);
		System.out.println("emp name is :"+emp_name);
	}
}
public class AbstractDemo {
public static void main(String[] args) {
	Demo ad=new Demo();
	ad.setData();
	ad.show();
}
}

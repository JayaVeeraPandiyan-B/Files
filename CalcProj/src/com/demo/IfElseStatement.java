package com.demo;

public class IfElseStatement {

	public static void main(String[] args) {
		
		int num = (int) (Math.random()*20);
		//System.out.println(num);
		
		if(num>=15)
			System.out.println(num+" - Greater than or Equal to 15");
			
		else if(num>=10 && num<=14)
			System.out.println(num+" - Inbetween 10 and 14");
		
		else if (num==9)
			System.out.println(num+" - Number is 9");
		
		else
			System.out.println(num+" - Lesser than or equal to 8");
	}

}

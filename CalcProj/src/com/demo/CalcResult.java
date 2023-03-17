package com.demo;

public class CalcResult {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		int i = calc.add(10, 2);
		System.out.println(i);	
		System.out.println(calc.add1(10, 2));

		int i1 = calc.sub(10, 2);
		System.out.println(i1);
		System.out.println(calc.sub1(10, 2));

		int i2 = calc.divi(10, 2);
		System.out.println(i2);
		System.out.println(calc.divi1(10, 2));

		int i3 = calc.multi(10, 2);
		System.out.println(i3);
		System.out.println(calc.multi1(10, 2));
		
		Calculator h = new Calculator();
		h.i++;
		Calculator j = new Calculator();
		j.i++;
		Calculator k = new Calculator();
		k.i++;
		System.out.println(k.i);
	}

}

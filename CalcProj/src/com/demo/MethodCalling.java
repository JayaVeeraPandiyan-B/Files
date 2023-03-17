package com.demo;

public class MethodCalling {
	
	public void go() {
		System.out.println("Print 0");
		go1();
	}
	public void go1() {
		System.out.println("Print 1");
		go2();
	}
	public void go2() {
		System.out.println("Print 2");
	}
	public static void main(String[] args) {
		
		//MethodCalling method = new MethodCalling();
		//method.go();
		
		String s1 = "Ganesh";
		String s2 = "Vignesh";
		System.out.println(s1=s2);
		
		
		
	}

}

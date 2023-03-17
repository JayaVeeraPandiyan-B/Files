package com.loops;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		for (int i=0;i<=10;i++) {
			
			//if (i>=5)
				//break;
			if (i>=6 && i<=8)
				continue;
			System.out.println(i);
			
		}
		System.out.println("Out of Codes");
	}

}

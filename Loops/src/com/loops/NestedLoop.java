package com.loops;

public class NestedLoop {

	public static void main(String[] args) {
		
		int i=0;
		int count = 0;
		while(i<6)	{
			
			for(int j=0;j<4;j++)	{
				
				int k=0;
				do {
					System.out.println("i => "+i+" j => "+j+" k => "+k);
					k++;
					count++;
				}while (k<2);
				
			}
			i++;
		} 
			System.out.println("Total Count is - "+count);
	}

}

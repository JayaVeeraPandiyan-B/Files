package com.arrays;

public class Arrays1D {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		System.out.println("Total index - "+array.length); // length is a final variable
		
//		array[0] = 10;
//		array[2] = 20;
//		array[4] = 30;
//		array[1] = 40;
//		array[3] = 50;
		
		for(int index = 0; index<array.length; index++)	{
			
			array[index] = (int) (Math.random()*1000);
			
			System.out.println(array[index]);	
			
		}	
		
		//for (int var:array)	{ // Also by using each loop
		//	System.out.println(var);
			
		//}
		
		System.out.println("-----Printing in reverse order-----");
		
		for (int index=array.length-1; index>=0; index--)	{
			System.out.println(array[index]);
			
		}
		
//		int[] array1 = {0,1,2,3,4};					Also we can do by this step, but not recommended.
//			System.out.println(array1.length);
	}

}

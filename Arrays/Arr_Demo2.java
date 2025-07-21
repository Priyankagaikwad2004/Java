package com.java.Arrays;

public class Arr_Demo2 {

	public static void main(String[] args) {
		
		int numbers[] = {10 , 20 , 30 , 40};
		
		System.out.println("numbers");
		for (int i = 0 ; i < numbers.length; i++) {
			System.out.println("Element at "+ i +" is : "+ numbers[i]);
		}
		
		
		String [] names = {"Chinki" , "minki", "pinki"};
		
		System.out.println();
		System.out.println("Names");
		for (int i = 0 ; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//valid examples
//				int[] numbers2 = new int [5];
//				String[] names2 = new String[4];
//				int[][] matrix1 = new int[2][2];
		
		
		
		System.out.println();		
			
			
			//using new keyword with initialization
//			int[] numbers3 = new int [] {10, 20, 30, 40};
//			
//			String [] names3 = new String[] {"Chinki" , "minki", "pinki"};
			
			
			//multi-dimentional array : 2D
			
			System.out.println("Matrix");
			int[][] arr2 = {{1, 2}, 
							{2,5},
							{8,7},
							{9,0}};
			
			for (int i = 0 ; i < 2; i++) {
				for (int j=0; j < 2; j++) {
					System.out.print(arr2[i][j] + " ");
				}
				System.out.println();
				
				
				//Array with dynamic size
//				int size = 10;
//				int [] numbers4 = new int[size];
				
				//Empty array
//				int numbers5[] = {};
//				String names5[] = {};
		}
		
	}

}

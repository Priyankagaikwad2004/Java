package com.java.Arrays;

public class TwoD_array {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3},
				{2,5,6},
				{8,7,7}};
		
		for (int row = 0 ; row < matrix.length ; row++) {
			for (int col=0; col < matrix[row].length ; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			
			System.out.println();
		}

	}

}

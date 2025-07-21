package com.java.Arrays;

public class Find_largest_element {

	public static void main(String[] args) {
		int arr[] = {12, 23, 46, 78, 43, 21};
		int largest = arr[0];
		
		for (int i= 1; i< arr.length ; i++) {
			if(arr[i] > largest) {
				largest = arr[i]; // updating largest element
			}
		}		
		
		System.out.println("The largest element is :" + largest);
	}

}
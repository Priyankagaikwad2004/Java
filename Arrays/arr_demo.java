package com.java.Arrays;

public class Arr_demo {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 30;
		arr[2] = 40;
		arr[3] = 50;
		arr[4] = 60;
		
		for (int i = 0 ; i < arr.length; i++) {
			System.out.println("Element at index "+ i +" is : "+ arr[i]);
		}
	}

}

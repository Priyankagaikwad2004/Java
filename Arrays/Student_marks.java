package com.java.Arrays;

import java.util.Scanner;

public class Student_marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		System.out.println("Enter the matks : ");
		
		for (int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0 ; i < arr.length; i++) {
			System.out.println("Element at marks for subject "+ i +" is : "+ arr[i]);
		}
		sc.close();
	}

}

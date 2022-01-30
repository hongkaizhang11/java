package com.huaxia.java1.homeworks.LoopHW;

public class LoopHW03 {

	public static void main(String[] args) {
		int n = 6;
		int output = 1;
		for (int i = 1; i <= n; i++) {
			output *= i;
		}
		System.out.printf("The factorial of %d is : %d.", n, output);
	}

}

// I could've sworn you didn't need Euler's number to calculate a factorial
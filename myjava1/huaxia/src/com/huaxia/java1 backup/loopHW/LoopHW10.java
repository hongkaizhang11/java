package com.huaxia.hongkai.loopHW;

import java.util.Scanner;

/**
 * 1. Accept number from user and calculate the sum of all number from 1 to a
 * given number
 * 
 * Expected result:
 * 
 * Enter a integer number: 100 The sum from 1 to 100 is 5050.
 * 
 * @author Hongkai Z
 *
 */

public class LoopHW10 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.println("Input number");
		int n1 = inputFromConsole.nextInt();
		inputFromConsole.close();
		int n2 = 0;
		for (int i = 1; i <= n1; ++i) {n2 += i;}
		System.out.printf("The sum from 1 to %d is %d", n1, n2);

	}

}
// I legitimately copied part of code from LoopHW09 to here
// I spent 5 minutes on this! 2 of which I was writing these comments!!! 
package com.huaxia.hongkai.loopHW;

import java.util.Scanner;

/**
 * 1. Given a number count the total number of digits in a number
 * 
 * 
 * For example, the number is 75869, so the output should be 5.
 * 
 * @author Hongkai Z
 *
 */

public class LoopHW12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n = input.nextLine();
		input.close();
		System.out.println(n.length());
	}

}

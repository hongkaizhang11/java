package com.huaxia.hongkai.loopHW;

import java.util.Scanner;

/**
 * 1. Write a program calculate Euler's constant.
Expected execution output:
Enter any positive integer: 10
The Euler's constant is 2.7182815255731922.
[Euler's Constant](https://www.mathsisfun.com/numbers/e-eulers-number.html)
 * @author Hongkai Z
 *
 */

public class LoopHW08 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.println("Input number:");
		float n = inputFromConsole.nextFloat();
		inputFromConsole.close();

		double Startoutput;
		Startoutput = 1+(1/n);
		double output = 1;
		for (int i = 1;i<=n;++i) {output *= Startoutput;}
		System.out.println(output);
	}
}


//I spent an hour on this :) 
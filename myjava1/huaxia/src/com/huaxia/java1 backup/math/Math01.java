package com.huaxia.hongkai.math;

import java.util.Scanner;

/**
 * * Write a Java program to calculate circle diameter with given radius.
 * For given radius = 3.2
 * Expected output:
 * The circle diameter with radius=3.2 is 6.4.
 * 
 * @author Hongkai Z
 *
 */

public class Math01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("");
		double r = input.nextDouble();
		input.close();
		double d = 2*r;
		System.out.printf("The circle diameter with radius=%.3f is %.3f.",r,d);
		

	}

}

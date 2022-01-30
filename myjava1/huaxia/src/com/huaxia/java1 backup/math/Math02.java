package com.huaxia.hongkai.math;

import java.util.Scanner;

/**
 * * Write a Java program to calculate circle area with given radius.
 * @author Hongkai Z
 *
 */

public class Math02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a radius of a circle: ");
		double r = input.nextDouble();
		input.close();
		double a = Math.PI*Math.pow(r,2);
		System.out.printf("The circle area with radius=%.3f is %.3f.", r,a);
	}

}

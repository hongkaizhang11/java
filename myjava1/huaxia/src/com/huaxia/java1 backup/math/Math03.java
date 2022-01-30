package com.huaxia.hongkai.math;

import java.util.Scanner;

/**
 * * Write a Java program to calculate circle circumference with given radius.
 * Display the circumference with only 3 decimal points.
 * $$ A = 2 \pi r $$
 * For given radius = 3
 * Expected output:
 * The circle circumference with radius=3 is 18.850.
 * 
 * @author Hongkai Z
 */

public class Math03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a radius of a circle: ");
		double r = input.nextDouble();
		input.close();
		double c = 2*Math.PI*r;
		System.out.printf("The circle circumference with radius=%.3f is %.3f.", r,c);
		
	}

}

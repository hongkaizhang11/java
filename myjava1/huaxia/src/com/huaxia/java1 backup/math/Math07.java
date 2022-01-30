package com.huaxia.hongkai.math;

import java.util.Scanner;

/**
 * * Write a Java program to calculate volume of a cylinder.
 * 
 * ![Cylinder Surface Area](images/cylinderVolume.png)
 * 
 * $$ V = \pi r^2 h $$
 * 
 * Expected output:
 * 
 * ``` 
 * Height of cylinder: 4
 * Radius of cylinder: 6
 * 
 * Volume is: 452.389 
 * ```
 * 
 * @author Hongkai Z
 *
 */

public class Math07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a height of a cylinder: ");
		double h = input.nextDouble();
		System.out.print("Enter a radius of a cylinder: ");
		double r = input.nextDouble();
		input.close();
		double v = Math.PI*r*r*h;
		System.out.printf("Height of cylinder: %.3f\nRadius of cylinder: %.3f\nVolume is: %.3f",h,r,v);

	}

}

package com.huaxia.hongkai.math;

import java.util.Scanner;

/**
 * * Write a Java program to calculate sphere volume with given radius.
 * 
 * ![](images/sphereVolume.png)
 * 
 * $$ V = \frac 4 3 \pi r^3 $$
 * 
 * For given radius = 3
 * 
 * Expected output:
 * 
 * The sphere volume with radius=3 is 113.097.
 * 
 * 
 * 
 * @author Hongkai Z
 *
 */

public class Math05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a radius of a sphere: ");
		double r = input.nextDouble();
		input.close();
		double v = 4*Math.PI*r*r*r/3;
		System.out.printf("The sphere volume with radius=%.3f is %.3f.",r,v);
	}

}

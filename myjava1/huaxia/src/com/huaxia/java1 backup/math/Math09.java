package com.huaxia.hongkai.math;

import java.util.Scanner;

/**
 * * Write a Java program to calculate primeter of a rectangle with given width
 * and length
 * 
 * Expected output:
 * 
 * ```output 
 * Calculate area of a rectagle:
 * length = 4 
 * width = 6
 * area = 24 
 * ```
 * 
 * @author Hongkai Z
 *
 */

public class Math09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a length of a rectangle: ");
		double l = input.nextDouble();
		System.out.print("Enter a width of a rectangle: ");
		double w = input.nextDouble();
		input.close();
		double a = l*w;
		System.out.printf("Calculate area of a rectangel\nlength = %.3f\nwidth = %.3f\narea = %.3f",l,w,a);

	}

}

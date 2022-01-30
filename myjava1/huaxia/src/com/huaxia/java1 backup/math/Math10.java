package com.huaxia.hongkai.math;

import java.util.Scanner;

/**
 * * Write a Java program to calculate area of a triangle with given base and
 * height.
 * 
 * ![Rectangle Primeter](images/triangleArea.webp)
 * 
 * >$$ A = \frac 1 2 b \cdot h $$
 * 
 * Expected output:
 * 
 * ```output Calculate area of a triangle:
 * 
 * base = 6 height = 4
 * 
 * area = 12 ```
 * 
 * @author Hongkai Z
 *
 */

public class Math10 { // copy paste copy paste copy paste

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a base of a triangle: ");
		double l = input.nextDouble();
		System.out.print("Enter a height of a triangle: ");
		double w = input.nextDouble();
		input.close();
		double a = l*w/2;
		System.out.printf("Calculate area of a trianglel\nbase = %.3f\nheight = %.3f\narea = %.3f",l,w,a);

	}

}

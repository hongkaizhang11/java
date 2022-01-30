package com.huaxia.hongkai.math;

import java.util.Scanner;

/**
 * * Write a Java program to calculate primeter of a rectangle with given width
 * and length.
 * 
 * $$ P = 2 (length + width) $$
 * 
 * Expected output:
 * 
 * ``` 
 * length = 4
 * width = 6
 * 
 * primeter = 20 ```
 * 
 * @author Hongkai Z
 *
 */

public class Math08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a length of a rectangle: ");
		double l = input.nextDouble();
		System.out.print("Enter a width of a rectangle: ");
		double w = input.nextDouble();
		input.close();
		double p = 2*(l+w);
		System.out.printf("length = %.3f\nwidth = %.3f\nprimeter = %.3f",l,w,p);
	}

}

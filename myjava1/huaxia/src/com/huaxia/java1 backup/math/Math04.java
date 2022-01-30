package com.huaxia.hongkai.math;

/**
 *  Write a Java program to calculate sphere surface area with given radius. 

![](images/sphere-surface-area.jpg)

$$ SA = 4 \pi r^2 $$

For given radius = 3

Expected output:

The sphere surface area with radius=3 is 339.292.


 */

import java.util.Scanner;

public class Math04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a radius of a sphere: ");
		double r = input.nextDouble();
		input.close();
		double sa = 4 * Math.PI * r * r * r;
		System.out.printf("The sphere surface area with radius=%.3f is %.3f.", r, sa);

	}

}

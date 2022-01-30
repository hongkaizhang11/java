package com.huaxia.hongkai.math;

/**
 * * Write a Java program to calculate surface area of a cylinder.
 * 
 * ![Cylinder Surface Area](images/cylinderSurfaceArea.png)
 * 
 * $$ A = 2 \pi r^2 + h(2\pi r) $$
 * 
 * Expected output:
 * 
 * ``` 
 * Height of cylinder: 4
 * Radius of cylinder: 6
 * 
 * Volume is: 452.389
 * Surface Area is: 376.991 ```
 * 
 * @author Hongkai Z
 *
 */

import java.util.Scanner;

public class Math06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a height of a cylinder: ");
		double h = input.nextDouble();
		System.out.print("Enter a radius of a cylinder: ");
		double r = input.nextDouble();
		input.close();
		double sa = r+h, v = Math.PI*r*r*h;
		sa *= 2*Math.PI*r;
		System.out.printf("Height of cylinder: %.3f\nRadius of cylinder: %.3f\nVolume is: %.3f\nSurface Area is: %.3f",h,r,v,sa);
	}

}

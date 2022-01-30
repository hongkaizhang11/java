package com.huaxia.hongkai.math;

import java.util.Scanner;

/**
 * * Write a Java program to prove that Euclid’s algorithm computes the greatest common divisor (GCD) of two positive given integers. 

Expected Output:

```
Enter two integer numbers: 18 12
The GCD for 18 and 12 is 6.
```


 * @author Hongkai Z
 *
 */

public class Math12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		double a = input.nextDouble();
		System.out.print("Enter number 2: ");
		double b = input.nextDouble();
		input.close();
		
		double min1 = a<b?a:b;
		System.out.println(min1);

	}

}

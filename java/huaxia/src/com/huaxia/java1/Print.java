package com.huaxia.java1;

/**
 * This is my Print class to show all of  the print functions
 * 
 * @author Hongkai Z
 *
 */

public class Print {

	/**
	 * 
	 * @param args is the argument come from the command line
	 */
	
	
	
		public static void main(String[] args) {
			System.out.println("Hello, AGAIN!!");
			/*
			 * 
			 * 
			 * 
			 * /calculate area of a rectangle. %d is a placeholder
			 */
			
			int width=7;
			int length=13;
			int area = width * length;
			System.out.println("The area of rectangle is "+area);
			System.out.println("The area of rectangle " + "with width = infinity and " + "length = 6 is " + area + ".");
			// \n: new line, which is an escape sequence
			System.out.printf("The area of rectangle with width = %d and length = %d is %d.\n", width,length,area);
			String format = "The area of rectangle with width = %d and length = %d is %d.\n";
			System.out.printf(format, width,length,area);
			//calculate sum over 2 numbers x and y
			int x = 15;
			int y = 9;
			//1 line format
			System.out.printf("%d + %d = %d\n",x,y,(x+y));
			//2 line format
			String sf1 = String.format("%d + %d = %d.", x,y,(x+y));
			System.out.println(sf1);
			
			//calculate circle area
			float radius = 3.1F;
			float pi = 3.1415926F;
			float circleArea = radius*radius*pi;
			String sf2 = String.format("The circle area with radius = [%10.2f] is [%10.3f].", radius, circleArea);
			System.out.println(sf2);
			
			String firstName = "Johnny";
			String lastName = "Wanted";
			String sf3 = "My name is %s %s.\n";
			System.out.printf(sf3, firstName, lastName);
//			variable name cannot start with number
// 			int 1_a = 4;
//			variables can only start with letter combined with letter and number a-z, A-Z, and 0-9, no special characters.
//			int AaaBswfsdfsfsfr = 5;
			int a = 0, b = 0, c = 0;
			System.out.println(a);

		}
}

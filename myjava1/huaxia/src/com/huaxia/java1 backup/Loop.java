package com.huaxia.hongkai;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// for loop syntax
		for (int i = 2; i <= 10; i += 2) {
			System.out.print(i + ", ");
		}
		System.out.println();
		// for loop with negative step
		int i = 10;
		for (; i > 0; i--) {
			// initialize looping variable; condition on looping variable; adjust looping
			// variable
			System.out.print(i + ", ");
//			if (i==10) break;
		}
		System.out.println("\nAfter the for loop, i = " + i);

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" }; // random car companies
		for (String car : cars) { // for each loop
			System.out.println(car);
		}

		// while loop
		i = 1;
		while (i <= 10) {
			System.out.print(i++ + ",");
		}
		System.out.println();
		
		// infinite while loop with conditional break
		Scanner input = new Scanner(System.in); // new Scanner() create a new Scanner class as a factory
		i = 0;
		while(true) { // infinite loop
			System.out.print(++i + " Do you want to continue? (y/n)");
			String answer = input.nextLine();
			if(answer.equals("n")) {
				break;
			}
		}
		input.close();
		System.out.println("buh bye!!");
		
		// while loop with continue
		i = 0;
		int sum = 0;
		while(i < 10) {
			if (i >= 4 && i < 7) {
				sum += i;
//				i++;
//				continue;
			}
			System.out.println(i);
			i++;
		}
		System.out.println(sum);
		
	}

}

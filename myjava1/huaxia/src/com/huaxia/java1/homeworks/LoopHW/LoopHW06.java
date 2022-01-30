// this isn't working as intended. Still under construction... Just skip to LoopHW07.java

package com.huaxia.java1.homeworks.LoopHW;

import java.util.Scanner;

public class LoopHW06 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.print("Input a number: ");
//		String data = inputFromConsole.nextLine();
//		int x = 1;
//		x = data*2;
		inputFromConsole.close();

		// use that to do that
		// utilize some feature I forgot
		for (int i = 1; i <= 9; ++i) {
			String str = String.format("%d x %d = %d", i, i, i * i); // fix
			System.out.println(str);
		}

	}

}

//Input a number: 6
//1 x 6 = 6
//2 x 6 = 12
//3 x 6 = 18
//4 x 6 = 24
//5 x 6 = 30
//6 x 6 = 36
//6 x 7 = 42
//6 x 8 = 48
//6 x 9 = 54
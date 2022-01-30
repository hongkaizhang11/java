package com.huaxia.hongkai.loopHW;

import java.util.Scanner;

public class LoopHW06 {

	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.print("Input a number: ");
		int a = inputFromConsole.nextInt();
		inputFromConsole.close();

		for (int b = 1; b <= 9; ++b) {
			String str = String.format("%d x %d = %d", a<b?a:b, a>b?a:b, a*b); // fix
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
package com.huaxia.hongkai.loopHW;

import java.lang.reflect.Array;
import java.util.Scanner;

public class LoopHW05 {

	public static void main(String[] args) {
		// copy pasted from MyScanner.java file
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.println("//Reminder - write something");
		String data = inputFromConsole.nextLine();
		inputFromConsole.close();

		String[] strArray = data.split("");
		int saLength = Array.getLength(strArray);
//		System.out.println(saLength);
		for (int i = saLength - 1; i >= 0; --i) {
			System.out.print(strArray[i]);
		}

	}

}
